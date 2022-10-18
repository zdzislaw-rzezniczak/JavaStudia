package com.company;

public class DigitSum {
    public static int sumDigit (int number){

        if (number<10)
            return -1;
        int sum = 0;
        for (int i = 1; i<=number; i*=10){
            int digit = (number/i) % 10;
            sum += digit;
        }

        return sum;
    }
}
