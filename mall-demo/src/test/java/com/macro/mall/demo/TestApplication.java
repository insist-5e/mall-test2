package com.macro.mall.demo;

import com.macro.mall.common.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplication {

    @Resource
    RedisService redisService;

    @Test
    public void TestFirst(){
        System.out.println(redisService!=null);
    }
}
