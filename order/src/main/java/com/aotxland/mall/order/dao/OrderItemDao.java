package com.aotxland.mall.order.dao;

import com.aotxland.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 11:08:19
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
