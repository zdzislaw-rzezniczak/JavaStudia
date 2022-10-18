package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int number1, int number2) {
        if ((number1<10 || number2<10))
            return -1;

        for (int i = number1; i> 0; --i)
                if ((number1 % i == 0) && (number2 % i == 0))
                    return i;

        return 1;
    }
}
