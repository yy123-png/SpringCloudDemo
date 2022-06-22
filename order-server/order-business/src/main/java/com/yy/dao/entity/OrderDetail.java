package com.yy.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yeyu
 * @since 2022-06-22 11:22
 */
@Data
@TableName("order_detail")
public class OrderDetail {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String orderNo;

    private Long skuId;

    private String skuName;

    private Integer quantity;
}
