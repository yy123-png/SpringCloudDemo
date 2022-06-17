package com.demo.biz.impl;

import com.demo.biz.IOrderBiz;
import com.demo.domain.entity.Order;
import com.demo.domain.entity.OrderDetail;
import com.demo.domain.service.IOrderDetailService;
import com.demo.domain.service.IOrderService;
import com.demo.dto.SkuDTO;
import com.demo.form.OrderCreateForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author yeyu
 * @since 2022-06-17 15:45
 */
@Service
public class OrderBizImpl implements IOrderBiz {

    @Resource
    private IOrderService orderService;

    @Resource
    private IOrderDetailService orderDetailService;

    @Resource
    private RestTemplate restTemplate;

    @Override
    @Transactional
    public void createOrder(OrderCreateForm orderCreateForm) {
        LocalDateTime now = LocalDateTime.now();
        String orderNo = UUID.randomUUID().toString();

        //1.计算总价 生成订单明细
        BigDecimal totalPrice = BigDecimal.ZERO;
        List<OrderDetail> orderDetails = new ArrayList<>();
        for (OrderCreateForm.OrderCreateDetail createDetail : orderCreateForm.getDetails()) {
            OrderDetail orderDetail = new OrderDetail();
            //2.查询商品
            SkuDTO skuDTO = restTemplate.getForObject(
                    "http://localhost:9000/goods/querySku?skuId=" + createDetail.getSkuId(),
                    SkuDTO.class);
            if (ObjectUtils.isEmpty(skuDTO)) {
                throw new RuntimeException("未查询到商品");
            }

            orderDetail.setOrderNo(orderNo);
            orderDetail.setSkuId(skuDTO.getId());
            orderDetail.setSkuName(skuDTO.getSkuName());
            orderDetail.setCreatedTime(now);
            orderDetail.setUpdatedTime(now);
            orderDetails.add(orderDetail);

            totalPrice = totalPrice.add(skuDTO.getPrice());

            //3.扣减库存
            Boolean success = restTemplate.getForObject(
                    "http://localhost:10001/stock/reduce?skuId=" + createDetail.getSkuId() + "&quantity=" + createDetail.getQuantity(),
                    Boolean.class
            );
            if (success == null || !success) {
                throw new RuntimeException("扣减库存失败");
            }
        }

        //4.生成订单
        Order order = new Order();
        order.setCreatedTime(now);
        order.setUpdatedTime(now);
        order.setOrderNo(UUID.randomUUID().toString());
        order.setTotalPrice(totalPrice);
        orderService.save(order);
        orderDetailService.saveBatch(orderDetails);
    }
}
