package com.example.springscheduling.service;

import com.example.springscheduling.util.ThreadUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MockRemoteService {
    public void healthCheck() {
        ThreadUtils.sleep(1000);
        System.out.println(ThreadUtils.currentTime() + ": I'm alive");
    }

    public void updateUserActivities() {
        System.out.println(ThreadUtils.currentTime() + ": Start updating User Actitivies");
        ThreadUtils.sleep(5000);
        System.out.println(ThreadUtils.currentTime() + ": Done updating User Actitivies");
    }
}
