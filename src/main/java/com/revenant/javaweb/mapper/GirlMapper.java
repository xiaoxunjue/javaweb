package com.revenant.javaweb.mapper;

import com.github.pagehelper.PageInfo;
import com.revenant.javaweb.common.mybatis.CommonMapper;
import com.revenant.javaweb.pojo.Girl;
import com.revenant.javaweb.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GirlMapper extends CommonMapper<Girl> {
    List<TestVo> findUserInfo();
}
