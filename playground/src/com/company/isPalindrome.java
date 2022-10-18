package com.company;

import java.util.Scanner;

public class isPalindrome {
    public static boolean isPalindrome (int number){
        int absNumber = Math.abs(number);
        int reverse=0;

        for (int i = 1; i<absNumber; i =i*10){
            int digit = (int)((absNumber/i) % 10);
            System.out.print(digit + " ");
            reverse = 10 * reverse + digit;
            }
        if (reverse == absNumber)
            return true;
        else
            return false;
    }

    public static boolean isPalindrome (String A){

        String reverse = "";

        for (int i = A.length(); i>0; --i){
            String subS = A.substring(i-1,i);
            System.out.println(subS);
            reverse += subS;
        }
        System.out.println(reverse);
        if (reverse.equals(A))
            return true;
        else
            return false;
    }
}
