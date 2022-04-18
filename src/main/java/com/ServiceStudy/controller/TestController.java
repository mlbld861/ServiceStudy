package com.ServiceStudy.controller;

import com.ServiceStudy.commom.lang.Result;
import com.ServiceStudy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    SysUserService userService;
    @GetMapping("/test")
    public Result test(){
        return Result.succ(userService.list());
    }
}
