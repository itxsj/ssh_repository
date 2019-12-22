package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("user")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("user")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @GetMapping("user/{id}")
    public User findOne(@PathVariable Integer id) {
		System.out.println("zs的笔记");
        return userService.findOne(id);
    }


    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

}
