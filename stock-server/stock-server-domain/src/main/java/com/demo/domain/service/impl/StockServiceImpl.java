package com.demo.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.domain.entity.Stock;
import com.demo.domain.mapper.IStockMapper;
import com.demo.domain.service.IStockService;
import org.springframework.stereotype.Service;

/**
 * @author yeyu
 * @since 2022-06-17 17:47
 */
@Service
public class StockServiceImpl extends ServiceImpl<IStockMapper, Stock> implements IStockService {
}
