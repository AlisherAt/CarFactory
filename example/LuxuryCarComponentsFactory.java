package com.example;

import com.example.Engine;
import com.example.InteriorStyle;
import com.example.NavigationSystem;

public class LuxuryCarComponentsFactory extends CarComponentsFactory {
    @Override
    public Engine createEngine() {
        return new Engine("V8 Twin-Turbo", 750);
    }

    @Override
    public NavigationSystem createNavigation() {
        return new NavigationSystem("Premium GPS Pro", true);
    }

    @Override
    public InteriorStyle createInterior() {
        return new InteriorStyle("Leather", "Beige");
    }
}