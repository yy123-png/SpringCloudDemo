package com.yy.biz;

import com.yy.param.OrderCreateParam;

/**
 * @author yeyu
 * @since 2022-06-22 11:19
 */
public interface IOrderBiz {
    Boolean createOrder(OrderCreateParam orderCreateParam);
}
