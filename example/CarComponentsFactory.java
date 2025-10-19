package com.example;

import com.example.Engine;
import com.example.InteriorStyle;
import com.example.NavigationSystem;

public abstract class CarComponentsFactory {
    public abstract Engine createEngine();
    public abstract NavigationSystem createNavigation();
    public abstract InteriorStyle createInterior();
}