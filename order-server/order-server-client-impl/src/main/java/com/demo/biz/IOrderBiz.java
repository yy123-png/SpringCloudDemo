package com.demo.biz;

import com.demo.form.OrderCreateForm;

/**
 * @author yeyu
 * @since 2022-06-17 15:44
 */
public interface IOrderBiz {
    void createOrder(OrderCreateForm orderCreateForm);
}
