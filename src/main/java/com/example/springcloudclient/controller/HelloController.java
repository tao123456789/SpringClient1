package com.example.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.example.springcloudclient.utils.User;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String helloRibbon() {
        System.out.println("=====触发test方法(get无参数)=====");
        return "【get】你好" + "\n" + "+this eureka port is  " + port;
    }

    @GetMapping("/test2/{testname}")
    public String helloRibbon2(@PathVariable("testname") String testname) {
        System.out.println("=====触发test2方法(get有参数)=====");
        return "【get（带参数）】你好," + testname + "\n"+ ",this eureka port is  " + port;
    }

    @PostMapping("/UserInfo")
    public String Post(@RequestBody String user){
        System.out.println("=====触发test方法(post无参数)=====");
        return "post成功" +"\n" + user;
    }
}
