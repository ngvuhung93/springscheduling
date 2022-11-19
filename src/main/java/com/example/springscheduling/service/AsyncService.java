package com.example.springscheduling.service;

import com.example.springscheduling.util.ThreadUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class AsyncService {

    @Async
    public void asyncTask() {
        System.out.println("Start execution of async. task");
        ThreadUtils.sleep(10000);
        System.out.println("Complete execution of async. task");
    }

    @Async
    public void asyncTaskWithException() {
        System.out.println("Start execution of async. task");
        ThreadUtils.sleep(10000);
        throw new RuntimeException("This is async exception message!!!");
    }

    @Async
    public Future<String> asyncWithReturn(String name) {
        System.out.println("Start execution of async. task with return for "+ name);
        ThreadUtils.sleep(5000);
        System.out.println("Complete execution of async. task with return for " + name);
        return new AsyncResult<>("Hello: " + name);
    }
    
}
