package com.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yeyu
 * @since 2022-06-17 14:36
 */
@TableName("order_detail")
@Data
public class OrderDetail {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String orderNo;

    private Long skuId;

    private String skuName;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

}
