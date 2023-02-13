package com.ua.robot.hw11;

public class AutoTruck extends Car{

    private final int maxCargoWeight;

    public AutoTruck(String model, String color, int maxSpeed, int price, int maxCargoWeight) {
        super(model, color, maxSpeed, price);
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public String carType() {
        return "AutoTruck";
    }

    @Override
    public String toString() {
        return "AutoTruck{ " +
                "model = '" + model + '\'' +
                ", color = '" + color + '\'' +
                ", maxSpeed = " + maxSpeed +
                ", price = " + price +
                "$, " + "maxCargoWeight = " + maxCargoWeight +
                " kg }";
    }
}
