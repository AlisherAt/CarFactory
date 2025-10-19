// EconomyCarImplementation.java
package com.example;

public class EconomyCarImplementation implements CarImplementation {
    private final Engine engine;
    private final Navigable navigation;
    private final InteriorStyle interior;

    public EconomyCarImplementation() {
        var factory = new EconomyCarComponentsFactory();
        this.engine = factory.createEngine();
        this.navigation = factory.createNavigation();
        this.interior = factory.createInterior();
    }

    @Override
    public Engine getEngine() { return engine; }
    @Override
    public Navigable getNavigation() { return navigation; }
    @Override
    public InteriorStyle getInterior() { return interior; }
}