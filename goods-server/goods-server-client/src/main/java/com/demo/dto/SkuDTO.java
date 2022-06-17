package com.demo.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yeyu
 * @since 2022-06-17 16:11
 */
@Data
public class SkuDTO {

    private Long id;

    private String skuName;

    private BigDecimal price;

}
