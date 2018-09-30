package com.revenant.javaweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.revenant.javaweb.mapper.GirlMapper;
import com.revenant.javaweb.pojo.Girl;
import com.revenant.javaweb.service.GirlService;
import com.revenant.javaweb.vo.in.TestVo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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
    public int addGirl(Girl girl) {
        return girlMapper.insert(girl);
    }

    @Override
    public int update(Girl girl) {
        return girlMapper.updateByPrimaryKey(girl);
    }

    @Override
    public Girl selectById(Girl girlId) {
        return girlMapper.selectOne(girlId);
    }

    @Override
    public int daletegirl(Girl girlId) {
        return girlMapper.delete(girlId);
    }

    @Override
    public List<Girl> selecctByIds(String name) {

        Example example = new Example(Girl.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", name);
        example.and(criteria);
        List<Girl> girls = girlMapper.selectByExample(example);
        return girls;
    }

    @Override
    public List<Girl> selecctByIds(String name, int age) {
        Example example = new Example(Girl.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", name);
        criteria.andEqualTo("age",age);
        example.and(criteria);
        List<Girl> girls = girlMapper.selectByExample(example);
        return girls;
    }

    @Override
    public PageInfo pagerselectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Girl> girls = girlMapper.selectAll();
        PageInfo<Girl> pageInfo = new PageInfo<Girl>(girls);
        return pageInfo;
    }
}
