package com.example;

import com.example.Engine;
import com.example.InteriorStyle;
import com.example.NavigationSystem;

public class EconomyCarComponentsFactory extends CarComponentsFactory {
    @Override
    public Engine createEngine() {
        return new Engine("Hybrid I4", 150);
    }

    @Override
    public NavigationSystem createNavigation() {
        return new NavigationSystem("Basic GPS", false);
    }

    @Override
    public InteriorStyle createInterior() {
        return new InteriorStyle("Fabric", "Gray");
    }
}