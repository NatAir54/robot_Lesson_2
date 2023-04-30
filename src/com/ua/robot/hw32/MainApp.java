package com.ua.robot.hw32;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        Thread t = new Thread(new SimpleThread());
        Thread t2 = new Thread(new AnotherSimpleThread());

        t.start();
        t2.start();
    }
}
