package com.yeye.controller;

import com.yeye.pojo.User;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Program: SpringBoot-swagger
 * Author: zdc
 * Date: 2022/7/29
 * Time: 13:53
 * Description:
 */
@Api(tags = "Hello控制类")
@RestController
public class HelloController {

    @GetMapping({"/#","/index"})
    public String index() {
        String str = "hello SpringBoot";
        return str;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello Swagger";
    }

    @ApiOperation("返回user实体类对象")
    @PostMapping("/user")
    public User user(@ApiParam("用户实体类") User user) {
        return user;
    }

    @ApiOperation("ss")
    @PostMapping("/sssss")
    public User user(@RequestParam(value = "username ") @ApiParam("用户名") String username
            , @RequestParam(value = "password " )  @ApiParam("密码") String password) {
        return new User(username, password);
    }

}
