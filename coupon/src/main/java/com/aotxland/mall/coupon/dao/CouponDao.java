package com.aotxland.mall.coupon.dao;

import com.aotxland.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 10:49:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
