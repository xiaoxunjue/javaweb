package com.revenant.javaweb.service;

import com.github.pagehelper.PageInfo;
import com.revenant.javaweb.pojo.Girl;
import com.revenant.javaweb.vo.in.TestVo;

import java.util.List;

public interface GirlService {
    List<Girl> selectAll();

    int addGirl(Girl girl);

    int update(Girl girl);

    Girl selectById(Girl girlId);

    int daletegirl(Girl girlId);

    List<Girl> selecctByIds(String name);

    List<Girl> selecctByIds(String name,int age);

    List<TestVo> list();

    PageInfo pagerselectAll(int pageNum, int pageSize);

}
