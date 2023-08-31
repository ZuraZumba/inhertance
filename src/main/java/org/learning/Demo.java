package org.learning;

import org.bikes.Bike;
import org.vehicle.Vehicle;

public class Demo {
    public static void main (String[] args){
        Bike harley = new Bike("Looong", "petrol", 2, 1, 9, "Normal");

        System.out.println(harley.getHandle());
        System.out.println(harley.getEngine());
        int tank = harley.getFuelTank();
        if(tank==8){
            System.out.println("kaia");
        } else{
            System.out.println("cudia");
        }
        System.out.println(harley.toString());




    }
}
