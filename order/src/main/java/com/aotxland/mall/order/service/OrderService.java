package com.aotxland.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aotxland.common.utils.PageUtils;
import com.aotxland.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 11:08:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

