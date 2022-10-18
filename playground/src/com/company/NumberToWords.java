package com.company;

public class NumberToWords {
    public enum Liczby {
        Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine;

        public static void printNumbers(int wybor){
            Liczby[] liczby = Liczby.values();
            System.out.print(liczby[wybor] + " ");
        }
    }

    public static int reverse (int number){
        int reverseNumber = 0;
        for (int i = 1; i <= Math.abs(number); i *=10){
            int digit = (number / i) % 10;
            reverseNumber = reverseNumber * 10 + digit;
        }
        return reverseNumber;
    }

    public static void numberToWords (int number){
        if (number < 0 )
            System.out.println("Invalid Value");
        int count = 0;
        int reverseNumber = reverse(number);
        for (int i = 1; i <= reverseNumber; i *=10) {
            int digit = (reverseNumber / i) % 10;
            Liczby.printNumbers(digit);
            ++count;
        }

        if (count != getDigitCount(number)){
            for (int i =1; i <= (getDigitCount(number) - count); ++i)
                System.out.print("Zero ");
        }
    }

    public static int getDigitCount (int number){
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;
        int count = 0;
        for (int i = 1; i <= number; i *=10)
            ++count;
        return count;
    }
}
