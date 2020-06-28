package com.dx.system.service;

import com.dx.system.model.User;
import org.springframework.stereotype.Service;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/28 0028 8:50
 */
@Service
public class UserService {

    public void addUser(User user){
        System.out.println("添加用户信息:"+user);
    }
}
