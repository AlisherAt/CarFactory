package com.example;


public class ExternalGPSProvider {
    public void calculateRouteTo(String location) {
        System.out.println("📍 ExternalGPS: Calculating optimal route to " + location + "...");
    }

    public void startGuidance() {
        System.out.println("🔊 ExternalGPS: Starting turn-by-turn voice guidance.");
    }
}