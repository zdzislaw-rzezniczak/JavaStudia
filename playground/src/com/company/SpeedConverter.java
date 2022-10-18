package com.company;

public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour >=0)
            return (long)(Math.round(kilometersPerHour/1.609));
        return -1;
    }

    public static void printConversion(double kilometersPerHours){
        if (kilometersPerHours<0)
            System.out.println("Invalid Value");
        else
        System.out.println(kilometersPerHours + " km/h = " + toMilesPerHour(kilometersPerHours) + " mi/h" );
    }
}
