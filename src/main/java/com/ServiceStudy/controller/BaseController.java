package com.ServiceStudy.controller;

import com.ServiceStudy.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @Autowired
    HttpServletRequest req;
    @Autowired
    RedisUtil redisUtil;
}
