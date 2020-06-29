package com.dx.system.aop;

import com.dx.system.model.User;
import com.dx.system.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/28 0028 9:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser(){
        User user=new User();
        user.setUserId(1L);
        user.setUserName("张三");
        userService.addUser(user);
    }
}
