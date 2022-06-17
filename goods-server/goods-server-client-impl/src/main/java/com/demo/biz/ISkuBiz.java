package com.demo.biz;

import com.demo.dto.SkuDTO;

/**
 * @author yeyu
 * @since 2022-06-17 16:21
 */
public interface ISkuBiz {
    SkuDTO querySku(Long skuId);
}
