package com.example.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.example.springcloudclient.utils.User;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String helloRibbon(@PathVariable("name1") String name1) {
        System.out.println("触发方法");
        return "你好     " + name1 + ",this eureka port is  " + port;
    }

    @GetMapping("/test2")
    public String helloRibbon2(@PathVariable("testname") String testname) {
        return "你好    " + testname + "\n"+ ",this eureka port is  " + port;
    }

    @PostMapping("/UserInfo")
    public String get(@RequestBody User user){
        return "成功";
    }
}
