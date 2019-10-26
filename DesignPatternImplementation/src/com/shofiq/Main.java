package com.shofiq;

import com.shofiq.interfaces.Vehicle;
import com.shofiq.models.Car;
import com.shofiq.models.Plane;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();

        if (car instanceof Vehicle)
        {
            car.set_num_of_passengers();
            car.set_num_of_wheels();
            Helper.printVehicle (car);

        }

        if (plane instanceof Vehicle)
        {
            plane.set_num_of_passengers();
            plane.set_num_of_wheels();
            Helper.printVehicle (plane);
        }
    }
}
