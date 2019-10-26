package com.shofiq.models;

public class Vehicle {


    public enum VehicleType {
        Car,
        Truck,
        Plane
    }

    public int no_of_wheels;
    public int no_of_passengers ;
    public boolean hasGas;
    public VehicleType type ;

    public Vehicle(int no_of_wheels, int no_of_passengers, boolean hasGas, VehicleType type) {
        this.no_of_wheels = no_of_wheels;
        this.no_of_passengers = no_of_passengers;
        this.hasGas = hasGas;
        this.type = type ;
    }

    public VehicleType getType() {
        return type;
    }

    public int getNo_of_wheels() {
        return no_of_wheels;
    }

    public int getNo_of_passengers() {
        return no_of_passengers;
    }

    public boolean isHasGas() {
        return hasGas;
    }

    public  void printVehicle () {

        System.out.println("############################");
        System.out.println("Vehicle Type : " + getType().name());
        System.out.println("Total Wheels : " + getNo_of_wheels());
        System.out.println("Total Passengers : " + getNo_of_passengers());
        System.out.println("Has Gas : " + isHasGas());

        System.out.println("############################");
    }
}
