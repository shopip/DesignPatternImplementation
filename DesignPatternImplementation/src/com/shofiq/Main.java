package com.shofiq;

import com.shofiq.builder.VehicleBuilderList;
import com.shofiq.models.Vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // This time a builder design pattern has been used to create different types of Vehicle
        ArrayList<Vehicle> vehicleList =  new VehicleBuilderList()
                .addVehicle().setVehicleType(Vehicle.VehicleType.Plane).setHasGas(true).setNo_of_wheels(5).setNo_of_passengers(220).addToList()
                .addVehicle().setVehicleType(Vehicle.VehicleType.Car).setHasGas(false).setNo_of_wheels(4).setNo_of_passengers(5).addToList()
                .addVehicle().setVehicleType(Vehicle.VehicleType.Truck).setHasGas(false).setNo_of_wheels(8).setNo_of_passengers(3).addToList()
                .build();

        for (Vehicle vehicle: vehicleList) {

            vehicle.printVehicle();

        }

    }
}
