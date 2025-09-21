package com.example;

import com.example.Car;

public class FamilyCarFactory implements CarFactory {
    private final CarComponentsFactory componentsFactory;

    public FamilyCarFactory(CarComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
    }

    @Override
    public Car createCar(String model, String color) {
        var engine = componentsFactory.createEngine();
        return new Car.Builder(model)
                .seats(7)
                .engine(engine)
                .color(color)
                .gps(true)
                .tripComputer(false)
                .build();
    }
}