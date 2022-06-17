package com.demo.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yeyu
 * @since 2022-06-17 14:50
 */
@Data
public class OrderDTO {
    private Long id;

    private String orderNo;

    private BigDecimal totalPrice;

    private Date createdTime;

    private Date updatedTime;
}
