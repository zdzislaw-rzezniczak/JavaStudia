package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        if (number < 0)
            return -1;

        int sum = 0;


        for (int i = 1; i<=number; i =i*10){
            int digit = (int)((number/i) % 10);
            if (digit % 2 == 0)
                sum += digit;
        }

        return sum;
    }
}
