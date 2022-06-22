package com.yy.param;

import lombok.Data;

import java.util.List;

/**
 * @author yeyu
 * @since 2022-06-22 11:17
 */
@Data
public class OrderCreateParam {

    private String requestId;

    private List<OrderCreateDetailParam> details;

    @Data
    public static class OrderCreateDetailParam {
        private Long skuId;
        private Integer quantity;
    }
}
