package com.company;

import java.util.Scanner;

public class MinimumMaximumChalange {
    public static void MinimumMaximum(){
        Scanner sc = new Scanner(System.in);


        int x;
       // boolean firstRun = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while (true){
            System.out.print("Enter a number: ");
            boolean hasInt = sc.hasNextInt();
//            if (hasInt && firstRun){
//                x = sc.nextInt();
//                min = x;
//                max = x;
//                firstRun = false;
//            }
            if (hasInt){
                x = sc.nextInt();
                if (x < min )
                    min = x;
                if (x > max)
                    max = x;
            } else{
                System.out.println("Minimum =" + min);
                System.out.println("maximum =" + max);
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
