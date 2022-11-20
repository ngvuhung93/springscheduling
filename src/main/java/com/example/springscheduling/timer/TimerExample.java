package com.example.springscheduling.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        System.out.println("Current time: " + new Date());

        // Delay 5s then run myTask only 1 time
        //timer.schedule(myTask, 5000);

        // Delay 0s then run myTask repeatedly after each 3s period
        timer.schedule(myTask,0,3000);
    }

}

class MyTask extends TimerTask{

    @Override
    public void run() {
        System.out.println("Run my Task " + new Date());
    }
}
