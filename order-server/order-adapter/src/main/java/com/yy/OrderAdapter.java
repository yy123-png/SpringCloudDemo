package com.yy;

import com.yy.biz.IOrderBiz;
import com.yy.param.OrderCreateParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-22 11:16
 */
@RestController
public class OrderAdapter {

    @Resource
    private IOrderBiz orderBiz;

    @PostMapping("/order/create")
    public Boolean createOrder(@RequestBody OrderCreateParam orderCreateParam) {
        return orderBiz.createOrder(orderCreateParam);
    }
}
