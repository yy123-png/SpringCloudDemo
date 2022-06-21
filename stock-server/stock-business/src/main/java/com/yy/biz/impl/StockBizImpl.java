package com.yy.biz.impl;

import com.yy.biz.IStockBiz;
import com.yy.dao.service.IStockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-21 17:04
 */
@Service
public class StockBizImpl implements IStockBiz {

    @Resource
    private IStockService stockService;

    @Override
    public Boolean reduceStock(Long skuId, Integer quantity) {
        return stockService.reduceStock(skuId, quantity);
    }
}
