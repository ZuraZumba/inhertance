package org.trucks;

import org.vehicle.Vehicle;

public class Truck extends Vehicle {
    public String steerings;
    public String musicSystem;
    public String airConditioner;
    public String container;

    public Truck(String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
    }
}
