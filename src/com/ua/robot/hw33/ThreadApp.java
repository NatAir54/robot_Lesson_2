package com.ua.robot.hw33;

import java.util.Random;

public class ThreadApp {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Thread thread = new Thread(new Task());
        thread.start();
    }
}

class Task implements Runnable {
    private static final Random random = new Random();

    @Override
    public void run() {
        System.out.printf("%s started \n", Thread.currentThread().getName());
        int number;
        while((number = random.nextInt(1, 11)) != 5) {
            System.out.println(number);
        }
        System.out.printf("%s finished \n", Thread.currentThread().getName());
    }
}
