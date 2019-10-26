package com.shofiq.models;

import com.shofiq.interfaces.Vehicle;

public class Car extends Transport  implements Vehicle {
    @Override
    public int set_num_of_wheels() {
        no_of_wheels = 4 ;
        return no_of_wheels;
    }

    @Override
    public int set_num_of_passengers() {
        no_of_passengers = 5;
        return no_of_passengers;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
