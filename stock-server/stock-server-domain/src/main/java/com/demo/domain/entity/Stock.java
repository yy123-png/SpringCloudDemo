package com.demo.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yeyu
 * @since 2022-06-17 17:44
 */
@Data
public class Stock {
    private Long id;

    private Long skuId;

    private Integer quantity;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;
}
