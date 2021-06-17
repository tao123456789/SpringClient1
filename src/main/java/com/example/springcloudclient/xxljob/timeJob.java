package com.example.springcloudclient.xxljob;

import com.example.springcloudclient.service.timejob;
import org.springframework.context.annotation.Configuration;

@Configuration
public class timeJob {

        timejob timejob=new timejob();
        public void execution(){
            System.out.println("=====定时任务触发=====");
            timejob.timejob();
        }
}
