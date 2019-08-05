package com.zuo.cache.cachedemo.controller;

import com.zuo.cache.cachedemo.pojo.User;
import com.zuo.cache.cachedemo.service.TestServiceInter;
import lombok.Value;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author codeManZuo
 * @date 2019/8/4 0004 - 17:01
 */

@RestController
public class TestController {

    @Autowired
    TestServiceInter testServiceInter;
    @GetMapping("/emp/{name}")
    public User getUser( @PathVariable("name") String name)
    {
        User user = testServiceInter.doGetUser(name);
        return user;
    }
}
