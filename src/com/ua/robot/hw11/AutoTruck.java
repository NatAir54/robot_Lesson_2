package com.ua.robot.hw11;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AutoTruck autoTruck = (AutoTruck) o;
        return maxCargoWeight == autoTruck.maxCargoWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxCargoWeight);
    }
}
