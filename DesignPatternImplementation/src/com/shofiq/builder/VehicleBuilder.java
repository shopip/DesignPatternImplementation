package com.shofiq.builder;

import com.shofiq.models.Vehicle;

public class VehicleBuilder {
    private int no_of_wheels;
    private int no_of_passengers;
    private boolean hasGas;
    private VehicleBuilderList vehicleBuilderList ;
    public Vehicle.VehicleType type ;

    public VehicleBuilder() {

    }

    public VehicleBuilder(VehicleBuilderList vehicleBuilderList) {
        this.vehicleBuilderList = vehicleBuilderList;
    }

    public VehicleBuilder setNo_of_wheels(int no_of_wheels) {
        this.no_of_wheels = no_of_wheels;
        return this;
    }

    public VehicleBuilder setNo_of_passengers(int no_of_passengers) {
        this.no_of_passengers = no_of_passengers;
        return this;
    }

    public VehicleBuilder setVehicleType(Vehicle.VehicleType type) {
        this.type = type;
        return this;
    }

    public VehicleBuilder setHasGas(boolean hasGas) {
        this.hasGas = hasGas;
        return this;
    }

    private Vehicle createVehicle() {
        return new Vehicle(no_of_wheels, no_of_passengers, hasGas,type);
    }

    public VehicleBuilderList addToList () {

       Vehicle vehicle = createVehicle();
       if (vehicleBuilderList == null)
           return null;

       return vehicleBuilderList.addVehicle(vehicle);

    }
}