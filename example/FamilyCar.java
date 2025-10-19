
package com.example;

public class FamilyCar extends CarAbstraction {
    private final String model;
    private final String color;
    private final int seats = 7;

    public FamilyCar(CarImplementation implementation, String model, String color) {
        super();
        this.model = model;
        this.color = color;
    }

    @Override
    public void startJourney(String destination) {
        System.out.println("🚐 Starting family trip in " + model);
        System.out.println("👨‍👩‍👧‍👦 Comfortable " + implementation.getInterior());
        implementation.getNavigation().navigate(destination);
    }

    @Override public String getModel() { return model; }
    @Override public String getColor() { return color; }
    @Override public int getSeats() { return seats; }

    @Override
    public String toString() {
        return "FamilyCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", engine=" + implementation.getEngine() +
                ", navigation=" + implementation.getNavigation() +
                ", interior=" + implementation.getInterior() +
                '}';
    }
}