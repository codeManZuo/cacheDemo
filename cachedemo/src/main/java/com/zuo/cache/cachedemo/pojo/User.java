package com.zuo.cache.cachedemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author codeManZuo
 * @date 2019/7/29 0029 - 20:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    String name;
    int old;
    String sex;
}
