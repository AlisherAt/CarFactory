package com.example;

public class InteriorStyle {
    private final String material;
    private final String color;

    public InteriorStyle(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return material + " interior in " + color;
    }
}