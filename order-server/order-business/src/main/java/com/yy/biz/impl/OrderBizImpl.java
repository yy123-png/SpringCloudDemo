package com.yy.biz.impl;

import com.yy.biz.IOrderBiz;
import com.yy.biz.impl.trans.OrderTransService;
import com.yy.bo.OrderCreateBO;
import com.yy.dao.entity.OrderDetail;
import com.yy.dao.entity.OrderInfo;
import com.yy.dto.SkuDTO;
import com.yy.param.OrderCreateParam;
import com.yy.param.StockReduceParam;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author yeyu
 * @since 2022-06-22 11:20
 */
@Service
public class OrderBizImpl implements IOrderBiz {

    @Resource
    private OrderTransService orderTransService;

    @Resource
    private RestTemplate restTemplate;

    @Override
    public Boolean createOrder(OrderCreateParam orderCreateParam) {
        List<OrderCreateParam.OrderCreateDetailParam> details = orderCreateParam.getDetails();
        //1.组装生成订单数据
        OrderInfo orderInfo = new OrderInfo();
        LocalDateTime now = LocalDateTime.now();
        String orderNo = UUID.randomUUID().toString();
        orderInfo.setOrderNo(orderNo);
        orderInfo.setCreatedTime(now);
        orderInfo.setUpdatedTime(now);

        List<OrderDetail> detailList = new ArrayList<>();
        List<StockReduceParam> reduceParams = new ArrayList<>();
        AtomicReference<BigDecimal> totalPrice = new AtomicReference<>();
        totalPrice.set(BigDecimal.ZERO);

        details.forEach(detail -> {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderNo(orderNo);
            orderDetail.setSkuId(detail.getSkuId());
            orderDetail.setQuantity(detail.getQuantity());
            // 查询商品
            SkuDTO skuDTO = querySku(detail.getSkuId());
            orderDetail.setSkuName(skuDTO.getSkuName());
            // 计算总价
            totalPrice.getAndUpdate(currentPrice ->
                    currentPrice.add(skuDTO.getPrice().multiply(BigDecimal.valueOf(detail.getQuantity()))));
            detailList.add(orderDetail);
            // 组装库存扣减参数
            StockReduceParam param = new StockReduceParam();
            param.setQuantity(detail.getQuantity());
            param.setSkuId(detail.getSkuId());
            reduceParams.add(param);
        });
        orderInfo.setTotalPrice(totalPrice.get());

        //2.数据库事务操作
        OrderCreateBO bo = new OrderCreateBO();
        bo.setOrderDetails(detailList);
        bo.setOrderInfo(orderInfo);
        bo.setStockReduceList(reduceParams);
        return orderTransService.createOrder(bo);
    }

    private SkuDTO querySku(Long skuId) {
        SkuDTO skuDTO = restTemplate.getForObject("http://localhost:9000/sku/" + skuId, SkuDTO.class);
        if (ObjectUtils.isEmpty(skuDTO)) {
            throw new RuntimeException("商品不存在!");
        }
        return skuDTO;
    }


}
