package com.zuo.cache.cachedemo;

import com.zuo.cache.cachedemo.mapper.UserMapper;
import com.zuo.cache.cachedemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CachedemoApplicationTests {
//org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
    }
    @Test
    public void test01()
    {
        User user = userMapper.getUserByName("左左");
        System.out.println(user);
    }

}
