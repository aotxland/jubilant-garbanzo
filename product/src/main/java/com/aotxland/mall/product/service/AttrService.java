package com.aotxland.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aotxland.common.utils.PageUtils;
import com.aotxland.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 10:17:48
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

