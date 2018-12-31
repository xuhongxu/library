package com.yanchao.library.service.impl;

import com.yanchao.library.mapper.UserMapper;
import com.yanchao.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xuhx
 * @date:2018/12/31
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int addUser(String name) {
        return userMapper.addUser(name);
    }
}
