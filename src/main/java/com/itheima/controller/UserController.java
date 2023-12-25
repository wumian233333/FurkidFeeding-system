package com.itheima.controller;



import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public String getUser() {
        return "hello user";
    }

    @PostMapping
    public Boolean save(@RequestBody User user)
    {
        return userService.save(user);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id)
    {
        return userService.delete(id);
    }
    @PutMapping()
    public Boolean update(@RequestBody User user)
    {
        return userService.update(user);
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id)
    {
        return userService.findById(id);
    }

}
