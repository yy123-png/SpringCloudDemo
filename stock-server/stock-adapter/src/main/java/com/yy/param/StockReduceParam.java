package com.yy.param;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author yeyu
 * @since 2022-06-21 17:14
 */
@Data
public class StockReduceParam {
    @NotNull(message = "商品ID不能为空")
    private Long skuId;

    @NotNull(message = "数量不能为空")
    @Min(value = 1,message = "数量最少为1")
    private Integer quantity;
}
