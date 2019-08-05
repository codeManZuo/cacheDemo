package com.zuo.cache.cachedemo.service;

import com.zuo.cache.cachedemo.mapper.UserMapper;
import com.zuo.cache.cachedemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author codeManZuo
 * @date 2019/8/4 0004 - 17:03
 */
@Service
public class TestService implements TestServiceInter {
    @Autowired
    UserMapper userMapper;

    @Override
    @Cacheable(cacheNames = {"user"})
    public User doGetUser(String name)
    {
        User user = userMapper.getUserByName(name);
        return  user;
    }
}
