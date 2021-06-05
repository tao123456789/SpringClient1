package com.example.springcloudclient.service;

import java.util.Date;

public class timejob {
    public void timejob(){
        Date date=new Date();
        System.out.println(date + ":定时调用服务内部timejob方法");
    }
}
