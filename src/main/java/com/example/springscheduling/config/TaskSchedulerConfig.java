package com.example.springscheduling.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableScheduling
public class TaskSchedulerConfig {

    @Bean
    public TaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler healthCheckTaskScheduler = new ThreadPoolTaskScheduler();
        healthCheckTaskScheduler.setPoolSize(10);
        return healthCheckTaskScheduler;
    }
}
