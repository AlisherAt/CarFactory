package com.example;

import com.example.Car;

public interface CarFactory {
    Car createCar(String model, String color);
}