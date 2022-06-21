package com.yy.biz;

/**
 * @author yeyu
 * @since 2022-06-21 17:03
 */
public interface IStockBiz {
    Boolean reduceStock(Long skuId,Integer quantity);
}
