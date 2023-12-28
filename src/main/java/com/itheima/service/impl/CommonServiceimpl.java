package com.itheima.service.impl;


import com.itheima.domain.Common;
import com.itheima.mapper.CommonMapper;
import com.itheima.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
//    @CacheEvict(value = "commonspace",key = "#id")
    public Boolean delete(Integer id) {
        return commonMapper.delete(id) > 0;
    }
    @Override
//    @CachePut(value = "commonspace",key = "#common.id")
    public Boolean update(Common common) {
        return commonMapper.update(common) > 0;
    }
    @Override
//    @Cacheable(value = "commonspace",key = "#id")
    public Common findById(Integer id) {
        return commonMapper.findById(id);
    }
}
