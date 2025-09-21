package com.example;

import com.example.Car;

public class SportsCarFactory implements CarFactory {
    private final CarComponentsFactory componentsFactory;

    public SportsCarFactory(CarComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
    }

    @Override
    public Car createCar(String model, String color) {
        var engine = componentsFactory.createEngine();
        return new Car.Builder(model)
                .seats(2)
                .engine(engine)
                .color(color)
                .gps(true)
                .tripComputer(true)
                .build();
    }
}