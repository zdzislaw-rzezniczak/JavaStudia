package com.company;


public class MyCalculatorEXCEPTION {
    public static long power(int n, int p) throws Exception {

        String belowZero = "n or p should not be negative.";
        String isZero = "n and p should not be zero.";

        if ( n < 0 || p < 0)
            throw new Exception(belowZero);
        if (n == 0 && p == 0)
            throw  new Exception(isZero);
        else
            return (long)Math.pow(n,p);
    }
}
