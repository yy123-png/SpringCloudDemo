package com.yy.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yeyu
 * @since 2022-06-21 16:45
 */
@Data
@TableName("stock")
public class Stock {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long skuId;

    private Integer quantity;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;
}
