package com.example.springcloudclient;

import com.example.springcloudclient.xxljob.timeJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.config.annotation.web.configuration.*;

@SpringBootApplication
@EnableWebSecurity
@Configuration
@EnableScheduling
public class SpringCloudClientApplication {

    public static void main(String[] args) { SpringApplication.run(SpringCloudClientApplication.class, args); }

    //定时任务
    @Scheduled(cron = "0/5 * * * * *")
    public void TimeJob(){
        timeJob timeJob=new timeJob();
        timeJob.execution();
    }

}
