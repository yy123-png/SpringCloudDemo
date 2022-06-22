package com.yy.biz.impl.trans;

import com.yy.bo.OrderCreateBO;
import com.yy.dao.service.IOrderDetailService;
import com.yy.dao.service.IOrderInfoService;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-22 11:34
 */
@Service
public class OrderTransService {

    @Resource
    private IOrderInfoService orderInfoService;

    @Resource
    private IOrderDetailService orderDetailService;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Transactional
    public Boolean createOrder(OrderCreateBO bo) {
        boolean saveResult = orderInfoService.save(bo.getOrderInfo());
        boolean saveBatchResult = orderDetailService.saveBatch(bo.getOrderDetails());
        //扣减库存 发送mq消息
        rocketMQTemplate.sendMessageInTransaction("REDUCE_STOCK",
                MessageBuilder.withPayload(bo.getStockReduceList()).build(),bo.getStockReduceList());
//        AtomicBoolean stockReduceResult = new AtomicBoolean(Boolean.TRUE);
//        bo.getStockReduceList().forEach(it -> {
//            Boolean success = restTemplate.postForObject("http://localhost:8000/stock/reduce", it, Boolean.class);
//            if (ObjectUtils.isEmpty(success) || !success) {
//                stockReduceResult.set(Boolean.FALSE);
//            }
//        });
        boolean success = saveBatchResult && saveResult;
        // 模拟 调用服务成功 本地操作失败
        success = false;
        if (!success) {
            throw new RuntimeException("创建订单失败!");
        }
        return Boolean.TRUE;
    }
}
