package com.yy.adapter;

import com.yy.biz.ISkuBiz;
import com.yy.dto.SkuDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-22 10:41
 */
@RestController
public class GoodsAdapter {

    @Resource
    private ISkuBiz skuBiz;

    @GetMapping("/sku/{skuId}")
    public SkuDTO skuQuery(@PathVariable("skuId") Long skuId) {
        return skuBiz.querySku(skuId);
    }
}
