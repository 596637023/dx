package com.dx.commons.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//启动Spring
@SpringBootTest
@ActiveProfiles("test")
public class RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis() {
        System.out.println(redisTemplate.opsForHash().get("liveData","064959461844"));
    }
}
