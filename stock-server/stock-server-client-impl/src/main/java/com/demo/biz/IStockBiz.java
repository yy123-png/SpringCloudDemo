package com.demo.biz;

/**
 * @author yeyu
 * @since 2022-06-17 17:51
 */
public interface IStockBiz {
    Boolean stockReduce(Long skuId, Integer quantity);
}
