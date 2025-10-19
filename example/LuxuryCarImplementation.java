
package com.example;

public class LuxuryCarImplementation implements CarImplementation {
    private final Engine engine;
    private final NavigationSystem navigation;
    private final InteriorStyle interior;

    public LuxuryCarImplementation() {
        var factory = new LuxuryCarComponentsFactory();
        this.engine = factory.createEngine();
        this.navigation = factory.createNavigation(); // NavigationSystem implements Navigable
        this.interior = factory.createInterior();
    }

    @Override
    public Engine getEngine() { return engine; }
    @Override
    public Navigable getNavigation() { return navigation; }
    @Override
    public InteriorStyle getInterior() { return interior; }
}