package com.zuo.cache.cachedemo.mapper;

import com.zuo.cache.cachedemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author codeManZuo
 * @date 2019/7/29 0029 - 20:46
 */
@Mapper
public interface  UserMapper {

    User getUserByName(String name);

}
