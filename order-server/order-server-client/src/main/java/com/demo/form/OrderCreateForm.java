package com.demo.form;

import lombok.Data;

import java.util.List;

/**
 * @author yeyu
 * @since 2022-06-17 14:44
 */
@Data
public class OrderCreateForm {

    private List<OrderCreateDetail> details;

    @Data
    public static class OrderCreateDetail {

        private Long skuId;

        private Integer quantity;
    }
}
