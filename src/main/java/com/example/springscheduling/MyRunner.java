package com.example.springscheduling;

import com.example.springscheduling.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private AsyncService asyncService;

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 5; i++) {
            asyncService.asyncTask();
        }

        Future<String> result1 = asyncService.asyncWithReturn("John Mayer");
        Future<String> result2 = asyncService.asyncWithReturn("Eric Clapton");
        Future<String> result3 = asyncService.asyncWithReturn("BB King");
        Thread.sleep(6000);
        System.out.println("Result1: " + result1.get());
        System.out.println("Result2: " + result2.get());
        System.out.println("Result3: " + result3.get());

        asyncService.asyncTaskWithException();

    }
}
