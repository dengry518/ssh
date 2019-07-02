package com.hzdl.controller;


import com.hzdl.entity.User;
import com.hzdl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/list")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

}
