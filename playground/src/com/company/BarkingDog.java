package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay){
        boolean shouldWakeUp = false;
        if (hourOfDay < 0 || hourOfDay >23)
            return false;
        if (isBarking==true && (hourOfDay < 8 || hourOfDay > 22))
            shouldWakeUp = true;

        return shouldWakeUp;
    }
}
