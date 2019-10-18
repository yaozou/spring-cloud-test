package com.yao.user.controller;/**
 * created by yaozou on 2018/7/17
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户controller测试
 * @author yaozou
 * @create 2018-07-17 17:20
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(){
        return "user-test";
    }
}
