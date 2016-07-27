package com.yoreay.ares;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by sanze on 2016/7/27.
 */
@Component
public class App {

    @Autowired
    private RedisTemplate redisTemplate;


    public void addData() {
        redisTemplate.opsForList().leftPush("age", "28");
    }

    public String getData() {
        return (String) redisTemplate.opsForList().leftPop("age");
    }
}
