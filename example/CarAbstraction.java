package com.example;

public abstract class CarAbstraction {
    protected CarImplementation implementation;

    public CarAbstraction() {
        this.implementation = implementation;
    }

    public abstract void startJourney(String destination);

    public CarImplementation getImplementation() {
        return implementation;
    }

    public abstract String getModel();
    public abstract String getColor();
    public abstract int getSeats();
}