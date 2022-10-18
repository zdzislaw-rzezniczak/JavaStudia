package com.company;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaCalculator {
    public static double area (double radius){
        if (radius<0)
            return -1;
        return PI * pow(radius, 2);
    }

    public static double area (double x, double y){
        if (x<0 || y<0)
            return -1;
        return x * y;
    }
}
