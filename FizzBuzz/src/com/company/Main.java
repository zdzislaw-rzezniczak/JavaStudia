package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num%5==0 && num%3==0){
            System.out.println("FizzBuzz");
        }
        else if (num%5==0 ){
                System.out.println("Fizz");
            }
        else if (num%3==0 ){
                System.out.println("Buzz");
            }
        else {
                System.out.println(num);
            }

        }
    }
}
