package com.example;

public class FeatureDecorator implements Drivable {
    private final Drivable car;
    private final String feature;
    private final double cost;

    public FeatureDecorator(Drivable car, String feature, double cost) {
        this.car = car;
        this.feature = feature;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + " + feature;
    }

    @Override
    public double getCost() {
        return car.getCost() + cost;
    }
}