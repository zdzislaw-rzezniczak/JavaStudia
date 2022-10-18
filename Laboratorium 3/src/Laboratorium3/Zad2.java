package Laboratorium3;

import java.util.Scanner;

public class Zad2 {
    public static void dzielnikiLiczby (){

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        int liczba = sc.nextInt();
        sc.close();
        System.out.print("dzielniki liczby " + liczba + ": ");
        for (int i = liczba; i > 0; --i){
            if (liczba % i == 0)
                System.out.print(i + " ");
        }
    }
}
