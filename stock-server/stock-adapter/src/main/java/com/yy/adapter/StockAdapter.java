package com.yy.adapter;

import com.yy.biz.IStockBiz;
import com.yy.param.StockReduceParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-21 17:13
 */
@RestController
public class StockAdapter {
    @Resource
    private IStockBiz stockBiz;

    @PostMapping("/stock/reduce")
    public Boolean reduceStock(@RequestBody @Validated StockReduceParam param) {
        return stockBiz.reduceStock(param.getSkuId(),param.getQuantity());
    }
}
