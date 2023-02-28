package com.ua.robot.hw15;

public abstract class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void work();
}

class Driver extends Human implements Driving{

    public Driver(String name, int age) {
        super(name, age);
    }

    @Override
    public void drive() {
        System.out.println("I drive a truck and trailer");
    }

    @Override
    void work() {
        System.out.println("I am a driver");
    }
}

class Pilot extends Human implements Flying {

    public Pilot(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("I fly a fighter jet");
    }

    @Override
    void work() {
        System.out.println("I am a pilot");
    }
}
