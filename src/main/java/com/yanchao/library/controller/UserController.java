package com.yanchao.library.controller;

import com.yanchao.library.entity.UserEntity;
import com.yanchao.library.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xuhx
 * @date:2018/12/31
 * @description:
 */
@RestController
@RequestMapping("/api/user")

@Api("用户")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/save")
    @ApiOperation(value = "保存用户",notes = "保存用户")
    public String addUser( @ApiParam(value = "用户名", required = true) @RequestParam("name") String name){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        int i = userService.addUser(name);
        if (i>0){
            return "保存成功";
        }else {
            return "保存失败";
        }
    }
}
