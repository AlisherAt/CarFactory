package com.example;

public class NavigationSystem {
    private final String name;
    private final boolean hasVoiceControl;

    public NavigationSystem(String name, boolean hasVoiceControl) {
        this.name = name;
        this.hasVoiceControl = hasVoiceControl;
    }

    @Override
    public String toString() {
        return name + (hasVoiceControl ? " (Voice Control)" : "");
    }
}