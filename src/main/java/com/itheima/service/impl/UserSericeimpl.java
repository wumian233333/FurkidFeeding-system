package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserSericeimpl implements UserService {
    @Autowired
    private UserMapper usermapper;
    @Override
    public Boolean save(User user) {
        return usermapper.insert(user) > 0;
    }
    @Override
    public Boolean delete(Integer id) {
        return usermapper.delete(id) > 0;
    }
    @Override
    public Boolean update(User user) {
        return usermapper.update(user) > 0;
    }
    @Override
    @Cacheable(value = "userSpace", key = "#id")
    public User findById(Integer id) {
        return usermapper.findById(id);
    }

}
