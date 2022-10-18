package com.company;

import java.util.Scanner;

public class DayOFWeek {

    public static void charSwitch (){
        String dayOfWeek = userDayInput();

        switch (dayOfWeek) {
            case "Monday":
                chosenLetterComunicate(dayOfWeek);
                break;
            case "Tuesday":
                chosenLetterComunicate(dayOfWeek);
                break;
            case "Wednesday":
                chosenLetterComunicate(dayOfWeek);
                break;
            case "Thursday":
                chosenLetterComunicate(dayOfWeek);
                break;
            case "Friday":
                chosenLetterComunicate(dayOfWeek);
                break;
            case "Saturday":
                chosenLetterComunicate(dayOfWeek);
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    private static void chosenLetterComunicate(String dayOfWeek){
        System.out.println("Today is: " + dayOfWeek);
    }

    private static String userDayInput (){
        Scanner in = new Scanner (System.in);
        System.out.print("What day is it? ");
        String actualDay = in.next().toLowerCase();
        String capActualDay = actualDay.substring(0, 1).toUpperCase() + actualDay.substring(1);
        return capActualDay;
    }
}
