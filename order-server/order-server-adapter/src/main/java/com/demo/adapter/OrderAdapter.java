package com.demo.adapter;

import com.demo.biz.IOrderBiz;
import com.demo.form.OrderCreateForm;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-17 13:55
 */
@RestController
public class OrderAdapter {

    @Resource
    private IOrderBiz orderBiz;

    @PostMapping("/order/create")
    public void orderCreate(@RequestBody OrderCreateForm orderCreateForm) {
        if (!CollectionUtils.isEmpty(orderCreateForm.getDetails())) {
            orderBiz.createOrder(orderCreateForm);
        }
    }
}
