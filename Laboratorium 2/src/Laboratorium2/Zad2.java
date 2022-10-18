package Laboratorium2;

import java.util.Scanner;

public class Zad2 {

    public static void wyznaczPierwiastki(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj parametr a: ");
        int a = sc.nextInt();
        System.out.println("Podaj parametr b: ");
        int b =sc.nextInt();
        System.out.println("Podaj parametr c: ");
        int c = sc.nextInt();
        sc.close();
        double delta = (b * b) - (4 * a * c);
        double x1;
        double x2;
        if (delta > 0){
            x1 = (-b - Math.sqrt(delta))/2 * a;
            x2 = (-b + Math.sqrt(delta))/2 * a;
            System.out.println("pierwiastki równnia to x1: " + x1 + "x2: " + x2);
        }

        if (delta == 0){
            x1 = (double)(-b) /2 * a;
            System.out.println("Równanie ma jedno rozwiązanie: " + x1);
        }
        if (delta < 0)
            System.out.println("Brak rozwiazań");


    }



}
