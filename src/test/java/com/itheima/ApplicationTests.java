package com.itheima;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        User user = userMapper.findById(1);
        System.out.println(user.toString());
    }
    @Test
    void test(){
        User user = new User();
        user.setId(4);
        user.setUsername("abc");
        userMapper.update(user);
    }

    @Test
    void test2(){
        User user = new User();
        user.setId(5);
        userMapper.delete(user.getId());
    }
    @Test
    void test3(){
        User user = new User();
        user.setId(4);
        user.setUsername("123");
        userMapper.insert(user);
    }

}
