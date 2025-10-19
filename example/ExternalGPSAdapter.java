package com.example;


public class ExternalGPSAdapter implements Navigable {
    private final ExternalGPSProvider gpsProvider;

    public ExternalGPSAdapter(ExternalGPSProvider gpsProvider) {
        this.gpsProvider = gpsProvider;
    }

    @Override
    public void navigate(String destination) {
        gpsProvider.calculateRouteTo(destination);
        gpsProvider.startGuidance();
    }
}