package com.yy.dao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yy.dao.entity.Stock;
import com.yy.dao.mapper.IStockMapper;
import com.yy.dao.service.IStockService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-21 16:47
 */
@Service
public class StockServiceImpl extends ServiceImpl<IStockMapper, Stock> implements IStockService {

    @Resource
    private IStockMapper stockMapper;

    @Override
    @Transactional
    public boolean reduceStock(Long skuId, Integer quantity) {
        return stockMapper.reduceStock(skuId,quantity);
    }
}
