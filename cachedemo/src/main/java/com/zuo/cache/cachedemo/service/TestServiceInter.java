package com.zuo.cache.cachedemo.service;

import com.zuo.cache.cachedemo.pojo.User;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author codeManZuo
 * @date 2019/8/4 0004 - 17:04
 */
public interface TestServiceInter {

    public User doGetUser(String name);
}
