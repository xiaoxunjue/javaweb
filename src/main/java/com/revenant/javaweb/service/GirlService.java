package com.revenant.javaweb.service;

import com.github.pagehelper.PageInfo;
import com.revenant.javaweb.pojo.Girl;
import com.revenant.javaweb.vo.TestVo;

import java.util.List;

public interface GirlService {
    List<Girl> selectAll();

    List<TestVo> list();

    PageInfo pagerselectAll(int pageNum , int pageSize );

}
