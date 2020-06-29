package com.dx.system.controller;

import com.dx.system.model.ResponseResult;
import com.dx.system.model.User;
import com.dx.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/28 0028 8:49
 */

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public void  add(User user){
       userService.addUser(user);
    }

    @GetMapping("/getUser")
    public ResponseResult getUser(User user){
        return  ResponseResult.SUCCESS(user);
    };

}
