package com.example.springscheduling.util;

public class ThreadUtils {

    private ThreadUtils(){}

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            System.err.println("Task interruption");
        }
    }

}
