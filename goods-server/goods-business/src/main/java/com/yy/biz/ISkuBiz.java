package com.yy.biz;

import com.yy.dto.SkuDTO;

/**
 * @author yeyu
 * @since 2022-06-22 10:43
 */
public interface ISkuBiz {
    SkuDTO querySku(Long skuId);
}
