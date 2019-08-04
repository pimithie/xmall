package com.xmall.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xiaqi
 * @date 2019/8/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestRedisConnection {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("username","夏齐");
        String username = (String) redisTemplate.opsForValue().get("username");
        System.out.println("username:"+username);
    }

}
