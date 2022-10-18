package com.company;

public class PerfectNumber {
    public static boolean isPerfectNumber (int pitchPerfect){
        if (pitchPerfect <= 1)
            return false;
        else{
            int sumOfDivisors = 0;

                for (int i =1; i < pitchPerfect; ++i){
                    if (pitchPerfect % i == 0)
                        sumOfDivisors += i;
                }
            return (sumOfDivisors == pitchPerfect);
        }
    }
}
