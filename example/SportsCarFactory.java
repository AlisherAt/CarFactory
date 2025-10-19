// SportsCarFactory.java (updated)
package com.example;

public class SportsCarFactory implements CarFactory {
    private final CarImplementation implementation;

    public SportsCarFactory(CarImplementation implementation) {
        this.implementation = implementation;
    }

    @Override
    public CarAbstraction createCar(String model, String color) {
        return new SportsCar(implementation, model, color);
    }
}