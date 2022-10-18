package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int number, int number2){
        if (number < 10 || number > 99 || number2 < 10 || number2 > 99)
            return false;


        for (int i = 1; i<=number; i =i*10){
            int digit = (number/i) % 10;
            for ( int k = 1; k <=number2; k = k * 10) {
                int digit2 = (number2/k) % 10;
                if (digit == digit2) {
                    return true;
                }

            }
        }

        return false;
    }

}
