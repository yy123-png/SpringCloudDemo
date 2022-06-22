package com.yy.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author yeyu
 * @since 2022-06-22 10:42
 */
@Data
public class SkuDTO {
    private Long id;

    private String skuName;

    private BigDecimal price;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

}
