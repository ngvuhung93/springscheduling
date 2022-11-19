package com.example.springscheduling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    MockRemoteService remoteService;

    @Scheduled(fixedRate=10000)
    public void healthCheck(){
        remoteService.healthCheck();
    }

    @Scheduled(fixedDelay=3000)
    public void updateUserActivity(){
        remoteService.updateUserActivities();
    }

}
