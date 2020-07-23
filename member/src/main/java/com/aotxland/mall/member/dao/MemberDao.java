package com.aotxland.mall.member.dao;

import com.aotxland.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author aotxland
 * @email aotxland#gmail.com
 * @date 2020-07-23 10:54:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
