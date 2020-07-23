package com.aotxland.mall.order.dao;

import com.aotxland.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 11:08:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
