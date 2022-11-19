package com.example.springscheduling.service;

import com.example.springscheduling.util.ThreadUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MockRemoteService {
    public void healthCheck() {
        ThreadUtils.sleep(1000);
        System.out.println(LocalDateTime.now() + ": I'm alive");
    }

    public void updateUserActivities() {
        System.out.println("Start updating User Actitivies");
        ThreadUtils.sleep(5000);
        System.out.println("Done updating User Actitivies");
    }
}
