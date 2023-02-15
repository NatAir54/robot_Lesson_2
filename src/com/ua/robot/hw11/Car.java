package com.ua.robot.hw11;

import java.util.Objects;

public class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;
    protected int price;

    public Car(String model, String color, int maxSpeed, int price) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String carType() {
        return "Car";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(color, car.color) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, maxSpeed, price);
    }

    @Override
    public String toString() {
        return "Car{ " +
                "model = '" + model + '\'' +
                ", color = '" + color + '\'' +
                ", maxSpeed = " + maxSpeed +
                " km/h, price = " + price +
                " $ }";
    }
}
