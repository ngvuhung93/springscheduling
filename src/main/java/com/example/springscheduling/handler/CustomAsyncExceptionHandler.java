package com.example.springscheduling.handler;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

public class CustomAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable ex, Method method, Object... params) {
        System.err.println("Async Exception caught in method " + method.getName()
                + " with content: " + ex.getMessage());
    }
}
