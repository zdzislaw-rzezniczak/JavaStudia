package com.company;

public class FirstLastDigitSum {
    public static int sumFirstandLastDigit (int number){
        if (number < 0)
            return -1;

        int firstDigit = 0;
        int lastDigit=0;

        for (int i = 1; i<=number; i =i*10){
            int digit = (int)((number/i) % 10);
            if (i == 1)
                firstDigit = digit;

            lastDigit = digit;
        }

        return firstDigit + lastDigit;
    }
}