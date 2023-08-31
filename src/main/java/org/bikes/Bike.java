package org.bikes;

import org.cars.Car;
import org.vehicle.Vehicle;

public class Bike extends Vehicle {
    private String handle;

    public Bike (String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

        public String getHandle(){
        return handle;
    }


}

