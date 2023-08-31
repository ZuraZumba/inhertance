package org.cars;

import org.vehicle.Vehicle;

public class Car extends Vehicle {
    private String steerings;
    private String musicSystem;
    private String airConditioner;
    private String entertaintmentSystem;
    private String fridge;

    public Car(String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
    }
}
