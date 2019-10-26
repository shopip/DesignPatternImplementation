package com.shofiq.models;

import com.shofiq.interfaces.Vehicle;

public class Plane extends Transport implements Vehicle {
    @Override
    public int set_num_of_wheels() {

        no_of_wheels = 8 ;
        return no_of_wheels;
    }

    @Override
    public int set_num_of_passengers() {
        no_of_passengers = 250;
        return no_of_passengers;
    }

    @Override
    public boolean has_gas() {
        return true;
    }
}
