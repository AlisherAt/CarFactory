package com.example;

import java.util.Scanner;

public class CarConfiguratorFacade {
    private final CarComponentsFactory factory;

    public CarConfiguratorFacade(CarComponentsFactory factory) {
        this.factory = factory;
    }

    public Car buildFamilyCar(String model, String color) {
        return new Car.Builder(model)
                .seats(7)
                .engine(factory.createEngine())
                .color(color)
                .gps(true)
                .tripComputer(false)
                .build();
    }

    public Car buildSportsCar(String model, String color) {
        return new Car.Builder(model)
                .seats(2)
                .engine(factory.createEngine())
                .color(color)
                .gps(true)
                .tripComputer(true)
                .build();
    }

    public Car buildCustomCar(Scanner scanner) {
        System.out.print("Model: ");
        String model = scanner.nextLine().trim();
        System.out.print("Color: ");
        String color = scanner.nextLine().trim();

        return new Car.Builder(model)
                .engine(factory.createEngine())
                .color(color)
                .gps(true)
                .seats(5)
                .build();
    }
}