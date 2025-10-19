package com.example;

public class NavigationSystem implements Navigable {
    private final String name;
    private final boolean hasVoiceControl;

    public NavigationSystem(String name, boolean hasVoiceControl) {
        this.name = name;
        this.hasVoiceControl = hasVoiceControl;
    }

    @Override
    public void navigate(String destination) {
        System.out.println("🧭 Navigating via " + name + " to " + destination);
        if (hasVoiceControl) {
            System.out.println("🔊 Voice guidance active.");
        }
    }

    @Override
    public String toString() {
        return name + (hasVoiceControl ? " (Voice Control)" : "");
    }
}