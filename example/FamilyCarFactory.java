package com.example;

public class FamilyCarFactory implements CarFactory {
    private final CarImplementation implementation;

    public FamilyCarFactory(CarImplementation implementation) {
        this.implementation = implementation;
    }

    @Override
    public CarAbstraction createCar(String model, String color) {
        return new FamilyCar(implementation, model, color);
    }
}