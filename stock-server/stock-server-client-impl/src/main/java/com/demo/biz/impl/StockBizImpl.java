package com.demo.biz.impl;

import com.demo.biz.IStockBiz;
import com.demo.domain.service.IStockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-17 17:51
 */
@Service
public class StockBizImpl implements IStockBiz {

    @Resource
    private IStockService stockService;

    @Override
    public Boolean stockReduce(Long skuId, Integer quantity) {
        // TODO
        return Boolean.TRUE;
    }
}
