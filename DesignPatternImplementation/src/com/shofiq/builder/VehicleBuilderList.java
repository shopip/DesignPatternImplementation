package com.shofiq.builder;

import com.shofiq.models.Vehicle;

import java.util.ArrayList;

public class VehicleBuilderList {

    public ArrayList<Vehicle> vehicleList ;

    public VehicleBuilderList() {

        vehicleList = new ArrayList<>();
    }

    public VehicleBuilder addVehicle () {

        return new VehicleBuilder(this);
    }

    public VehicleBuilderList addVehicle (Vehicle vehicle) {

        vehicleList.add(vehicle);
        return this ;
    }

    public ArrayList<Vehicle> build () {

        return  vehicleList ;

    }



}
