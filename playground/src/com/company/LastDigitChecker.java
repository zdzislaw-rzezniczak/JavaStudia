package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int number, int number2, int number3){

        if (!isValid(number)|| !isValid(number2) || !isValid(number3))
            return false;

       int lastDigit = number % 10;
       int lastDigit2 = number2 % 10;
       int lastDigit3 = number3 % 10;

        return lastDigit == lastDigit2 || lastDigit == lastDigit3 || lastDigit2 == lastDigit3;

    }

    public static boolean isValid (int number) {

        return (number >= 10 && number<= 1000);

    }
}
