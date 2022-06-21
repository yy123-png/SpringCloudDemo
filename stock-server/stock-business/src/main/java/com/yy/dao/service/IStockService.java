package com.yy.dao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yy.dao.entity.Stock;

/**
 * @author yeyu
 * @since 2022-06-21 16:47
 */
public interface IStockService extends IService<Stock> {
    boolean reduceStock(Long skuId, Integer quantity);
}
