package com.shofiq;

import com.shofiq.interfaces.Vehicle;
import com.shofiq.models.Transport;

public class Helper {

    public static void printVehicle (Transport transport) {

        System.out.println("############################");
        System.out.println("Total Wheels : " + transport.getNo_of_wheels());
        System.out.println("Total Passengers : " + transport.getNo_of_passengers());
        if (transport instanceof Vehicle)
        {
            Vehicle vehicle = (Vehicle) transport;
            System.out.println("Has Gas : " + vehicle.has_gas());
        }
        System.out.println("############################");
    }

}
