package com.ua.robot.hw11;

public class PassengerCar extends Car{

    public PassengerCar(String model, String color, int maxSpeed, int price) {
        super(model, color, maxSpeed, price);
    }

    @Override
    public String carType() {
        return "PassengerCar";
    }

    @Override
    public String toString() {
        return "PassengerCar{ " +
                "model = '" + model + '\'' +
                ", color = '" + color + '\'' +
                ", maxSpeed = " + maxSpeed +
                " km/h, price = " + price +
                " $ }";
    }
}
