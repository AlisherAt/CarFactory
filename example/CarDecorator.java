package com.example;

public abstract class CarDecorator implements Drivable {
    protected final Drivable car;

    public CarDecorator(Drivable car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost();
    }
}