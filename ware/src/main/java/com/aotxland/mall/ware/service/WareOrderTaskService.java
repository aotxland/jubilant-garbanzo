package com.aotxland.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aotxland.common.utils.PageUtils;
import com.aotxland.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 11:10:34
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

