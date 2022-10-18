package com.company;

public class LargestPrime {
    public static int getLargestPrime (int number){
        int prime = 0;
        if (number <2) return -1;
        for (int i = number; i>1; --i){
            if (number % i == 0) {
                prime = i;
                for (int k = 2; k < i; ++k) {
                    if (i % k == 0){
                        prime = -1;
                        break;
                    }
                }
                if (prime != -1) return prime;
            }
        }
        return prime;

    }


    public static int getLargestPrime2(int number){

        if(number <= 1){
            return -1;
        }

        for(int i = number-1; i > 1; i--){
            if(number%i == 0){
                number = i;
            }
        }

        return  number;
    }

    public static boolean isPrime (int number){
        if (number == 1)
            return false;
        for (int i=2; i<number; i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static String isPrime2 (int number){
        if (number == 1)
            return "Not prime";
        for (int i=2; i<number; i++){
            if (number % i == 0)
                return "Not prime";;
        }
        return "Prime";
    }
}
