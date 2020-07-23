package com.aotxland.mall.product.dao;

import com.aotxland.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 10:17:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
