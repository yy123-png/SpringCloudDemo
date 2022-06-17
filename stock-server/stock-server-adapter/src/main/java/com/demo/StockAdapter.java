package com.demo;

import com.demo.biz.IStockBiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-17 17:52
 */
@RestController
public class StockAdapter {

    @Resource
    private IStockBiz stockBiz;

    @GetMapping("/stock/reduce")
    public Boolean stockReduce(Long skuId,Integer quantity) {
        return stockBiz.stockReduce(skuId,quantity);
    }
}
