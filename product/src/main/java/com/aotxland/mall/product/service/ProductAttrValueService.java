package com.aotxland.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aotxland.common.utils.PageUtils;
import com.aotxland.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 10:17:48
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

