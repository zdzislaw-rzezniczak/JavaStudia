package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);


        int number;
        int sum = 0;
        long avarage = 0;
        int count = 0;


        while (true){
            boolean hasInt = sc.hasNextInt();

            if (hasInt){
                ++ count;
                number = sc.nextInt();
                sum += number;
                avarage = Math.round((float)sum / count);
            } else{
                System.out.println("SUM = " + sum + " AVG = " + avarage);
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }

}
