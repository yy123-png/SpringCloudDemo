package com.demo.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author yeyu
 * @since 2022-06-17 14:50
 */
@Data
public class OrderDetailDTO {
    private Long id;

    private String orderNo;

    private Long skuId;

    private String skuName;

    private Date createdTime;

    private Date updatedTime;
}
