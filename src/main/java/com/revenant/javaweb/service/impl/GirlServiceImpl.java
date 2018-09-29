package com.revenant.javaweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.revenant.javaweb.mapper.GirlMapper;
import com.revenant.javaweb.pojo.Girl;
import com.revenant.javaweb.service.GirlService;
import com.revenant.javaweb.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GirlServiceImpl implements GirlService {
    @Resource
    private GirlMapper girlMapper;

    @Override
    public List<TestVo> list() {
        return girlMapper.findUserInfo();
    }

    @Override
    public List<Girl> selectAll() {
        return this.girlMapper.selectAll();
    }

    @Override
    public PageInfo pagerselectAll(int pageNum , int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Girl> girls = girlMapper.selectAll();
        PageInfo<Girl> pageInfo=new PageInfo<Girl>(girls);
        return pageInfo;
    }
}
