package com.yy.bo;

import com.yy.dao.entity.OrderDetail;
import com.yy.dao.entity.OrderInfo;
import com.yy.param.StockReduceParam;
import lombok.Data;

import java.util.List;

/**
 * @author yeyu
 * @since 2022-06-22 11:36
 */
@Data
public class OrderCreateBO {
    private OrderInfo orderInfo;

    private List<OrderDetail> orderDetails;

    private List<StockReduceParam> stockReduceList;
}
