package com.itheima.service.impl;


import com.itheima.domain.Common;
import com.itheima.mapper.CommonMapper;
import com.itheima.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceimpl implements CommonService {
    @Autowired
    private CommonMapper commonMapper;
    @Override
    public Boolean save(Common common) {
        return commonMapper.insert(common) > 0;
    }
    @Override
    public Boolean delete(Integer id) {
        return commonMapper.delete(id) > 0;
    }
    @Override
    public Boolean update(Common common) {
        return commonMapper.update(common) > 0;
    }
    @Override
    public Common findById(Integer id) {
        return commonMapper.findById(id);
    }
}
