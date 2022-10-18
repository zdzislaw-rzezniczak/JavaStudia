package com.company;

public class IntEqualityPrinter {
    public static void printEqual (int no1, int no2, int no3){
        if (no1 < 0 || no2 < 0 || no3 < 0)
            System.out.println("Invalid Value");
        else if (no1 == no2 && no2 == no3)
            System.out.println("All numbers are equal");
        else if (no1 != no2 && no2 != no3 && no1 != no3)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}
