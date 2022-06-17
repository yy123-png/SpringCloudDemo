package com.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author yeyu
 * @since 2022-06-17 14:32
 */
@TableName("order_info")
@Data
public class Order {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String orderNo;

    private BigDecimal totalPrice;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

}
