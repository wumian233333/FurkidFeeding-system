package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSericeimpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Boolean save(User user) {
        return userMapper.insert(user) > 0;
    }
    @Override
//    @CacheEvict(value = "userspace",key = "#id")
    public Boolean delete(Integer id) {
        return userMapper.delete(id) > 0;
    }
    @Override
//    @CachePut(value = "userspace",key = "#user.id")
    public Boolean update(User user) {
        return userMapper.update(user) > 0;
    }
    @Override
//    @Cacheable(value = "userspace",key = "#id")
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

}
