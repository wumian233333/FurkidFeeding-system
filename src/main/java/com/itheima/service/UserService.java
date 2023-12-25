package com.itheima.service;
import com.itheima.domain.User;

public interface UserService {
    Boolean save(User user);
    Boolean delete(Integer id);
    Boolean update(User user);
    User findById(Integer id);



}
