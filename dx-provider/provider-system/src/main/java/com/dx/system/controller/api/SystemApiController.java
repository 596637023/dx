package com.dx.system.controller.api;

import com.dx.system.api.SystemApi;
import com.dx.system.model.User;
import com.dx.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/29 0029 14:35
 */
@RestController
public class SystemApiController implements SystemApi {

    @Autowired
    private UserService userService;

    @Override
    public User queryUserById(String userId) {
        return userService.getUserById(userId);
    }

}
