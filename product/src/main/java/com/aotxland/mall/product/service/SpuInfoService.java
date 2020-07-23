package com.aotxland.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aotxland.common.utils.PageUtils;
import com.aotxland.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 10:17:48
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

