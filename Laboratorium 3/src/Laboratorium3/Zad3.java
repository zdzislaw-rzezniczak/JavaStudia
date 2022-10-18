package Laboratorium3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zad3 {
    public static int guessingGame(){

        int min = 1;
        int max = 200;

        int liczba = min + (int)(Math.random() * ((max - min) + 1));
        int liczbaWybrana;
        int licznikProb = 0;

        System.out.println("Zagrajmy w gre!");
        System.out.println("podaj liczbe od 1 do 200. Masz 7 prob");
        Scanner sc = new Scanner(System.in);
        while (licznikProb < 7){
            liczbaWybrana = sc.nextInt();
            ++licznikProb;
            if (liczbaWybrana == liczba){
                System.out.println("wygrales liczba wylosowana to: " + liczba);
                return 1;
            }

            else if (liczbaWybrana < liczba)
                System.out.println("Twoja liczba jest mniejsza niz wylosowana");
            else
                System.out.println("Twoja liczba jest wiekszza niz wylosowana");
            System.out.println("To byla twoja " + licznikProb + " proba");

        }
        sc.close();

        System.out.println("przegrales. Wylosowana liczba to: " + liczba );
        return -1;
    }
}
