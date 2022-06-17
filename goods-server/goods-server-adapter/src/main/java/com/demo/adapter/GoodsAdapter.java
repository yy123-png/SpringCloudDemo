package com.demo.adapter;

import com.demo.biz.ISkuBiz;
import com.demo.dto.SkuDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yeyu
 * @since 2022-06-17 16:31
 */
@RestController
public class GoodsAdapter {

    @Resource
    private ISkuBiz skuBiz;

    @GetMapping("/goods/querySku")
    public SkuDTO querySku(Long skuId) {
        return skuBiz.querySku(skuId);
    }
}
