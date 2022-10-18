package com.company;

import java.util.Scanner;

public class ScannerExcercise {

    public static int scannerEx (){
        Scanner sc = new Scanner(System.in);

        int sum =0;

        for (int i =1; i <= 10; ++i){
            System.out.print("Enter number #" + i + ": ");
            boolean hasInt = sc.hasNextInt();
            if (hasInt){
                int t = sc.nextInt();
                sum += t;
            } else {
                System.out.println("Invalid number");
                return -1;
            }
        }
        sc.close();

        System.out.println("Suma wszystkich likczb = " + sum);
        return sum;
    }
}
