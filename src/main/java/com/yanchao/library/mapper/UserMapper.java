package com.yanchao.library.mapper;

import org.apache.ibatis.annotations.Insert;

/**
 * @author: yanchao
 * @date:2018/12/31
 * @description:
 */
public interface UserMapper {
    @Insert("INSERT INTO user_test (name) VALUES(#{name})")
    int addUser(String name);
}
