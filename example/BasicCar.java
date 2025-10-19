package com.example;

public class BasicCar implements Drivable {
    private final String model;
    private final String color;

    public BasicCar(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return model + " (" + color + ")";
    }

    @Override
    public double getCost() {
        return 20000.0;
    }
}