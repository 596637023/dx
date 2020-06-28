package com.dx.commons.mybatisplus;

import com.dx.commons.mybatisplus.mapper.UserMapper;
import com.dx.commons.mybatisplus.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/24 0024 13:55
 * 基础增删改查测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MybatisPlusBasicTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
