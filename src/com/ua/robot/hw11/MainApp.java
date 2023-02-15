package com.ua.robot.hw11;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Car[] cars = {new PassengerCar("BMW", "red", 250, 25000),
                new AutoTruck("Audi", "grey", 220, 21000, 35000)};

        System.out.println(Arrays.asList(cars));
        for (Car car: cars) {
            System.out.println(car.carType());
        }


    }
}
