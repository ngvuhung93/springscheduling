package com.example.springscheduling.util;

import java.util.Date;

public class ThreadUtils {

    private ThreadUtils(){}

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            System.err.println("Task interruption");
        }
    }

    public static String currentTime(){
        return (new Date()).toString();
    }

}
