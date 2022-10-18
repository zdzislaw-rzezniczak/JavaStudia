package com.company;


public class DurationString {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDurationString(int minutes, int seconds){
        if (seconds<=0 || seconds>=59 || minutes<0)
            return INVALID_VALUE_MESSAGE ;
        else{
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            return hours + "h " + remainingMinutes + "m " + seconds +"s";
        }
    }


    public static String getDurationString(int seconds){
        if (seconds<0)
            return INVALID_VALUE_MESSAGE;
        else{
            int minutes = seconds / 60;
            int remainingSeconds= seconds % 60;

            return getDurationString(minutes, remainingSeconds);
        }
    }
}
