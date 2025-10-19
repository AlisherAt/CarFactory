package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🔧 Demonstrating Abstract Factory:");
        System.out.print("Choose car family (luxury/economy): ");
        String familyChoice = scanner.nextLine().trim().toLowerCase();

        CarComponentsFactory componentsFactory;
        if (familyChoice.equals("luxury")) {
            componentsFactory = new LuxuryCarComponentsFactory();
        } else {
            componentsFactory = new EconomyCarComponentsFactory();
        }

        CarFactory sportsFactory = new SportsCarFactory((CarImplementation) componentsFactory);
        CarFactory familyFactory = new FamilyCarFactory((CarImplementation) componentsFactory);

        CarAbstraction supercar = sportsFactory.createCar("Ferrari SF90", "Rosso Corsa");
        CarAbstraction minivan = familyFactory.createCar("Toyota Sienna", "Pearl White");

        System.out.println("\n🏎️  " + supercar);
        System.out.println("🚐  " + minivan);

        System.out.println("\n🛠️  Custom Car Builder");
        try {
            Car customCar = buildCarFromUserInput(scanner, componentsFactory);
            System.out.println("\n✅ Your Custom Car:");
            System.out.println(customCar);
        } catch (IllegalArgumentException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }

        System.out.println("\n✨ Demonstrating Facade Pattern:");
        CarConfiguratorFacade facade = new CarConfiguratorFacade(componentsFactory);
        Car easyFamilyCar = facade.buildFamilyCar("Kia Carnival", "Silver");
        Car easySportsCar = facade.buildSportsCar("Lamborghini Huracan", "Green");
        System.out.println("Family (via Facade): " + easyFamilyCar);
        System.out.println("Sports (via Facade): " + easySportsCar);

        System.out.println("\n✨ Demonstrating Decorator Pattern:");
        Drivable baseCar = new BasicCar("Toyota Corolla", "White");
        Drivable enhancedCar = new FeatureDecorator(
                new FeatureDecorator(baseCar, "Premium Audio", 1200),
                "Panoramic Sunroof", 1800
        );
        System.out.println("Base: " + baseCar.getDescription() + " — $" + (int) baseCar.getCost());
        System.out.println("Enhanced: " + enhancedCar.getDescription() + " — $" + (int) enhancedCar.getCost());

        scanner.close();
    }

    private static Car buildCarFromUserInput(Scanner scanner, CarComponentsFactory factory) {
        System.out.print("Enter car model: ");
        String model = scanner.nextLine().trim();
        if (model.isEmpty()) throw new IllegalArgumentException("Model cannot be empty.");

        int seats = parseInt(scanner, "Enter number of seats: ");

        System.out.print("Enter engine type: ");
        String engineType = scanner.nextLine().trim();
        double hp = parseDouble(scanner, "Enter horsepower: ");

        Engine engine = new Engine(engineType, hp);

        System.out.print("Color: ");
        String color = scanner.nextLine().trim();

        System.out.print("GPS? (true/false): ");
        boolean gps = Boolean.parseBoolean(scanner.nextLine().trim());

        System.out.print("Trip Computer? (true/false): ");
        boolean tripComp = Boolean.parseBoolean(scanner.nextLine().trim());

        return new Car.Builder(model)
                .seats(seats)
                .engine(engine)
                .color(color)
                .gps(gps)
                .tripComputer(tripComp)
                .build();
    }

    private static int parseInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number.");
        }
    }

    private static double parseDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number.");
        }
    }
}