package com.yy.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author yeyu
 * @since 2022-06-21 17:43
 */
@Data
public class Sku {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String skuName;

    private BigDecimal price;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;
}
