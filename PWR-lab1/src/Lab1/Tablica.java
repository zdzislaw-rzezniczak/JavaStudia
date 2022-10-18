package Lab1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tablica {
    public static int [] stworzTablice (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int n = sc.nextInt();
        sc.close();

        int [] tablica = new int[n];

        int min = 0;
        int max = 999;
        Random rand = new Random();
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = rand.nextInt((max - min) + 1) + min;
        }
        System.out.println(Arrays.toString(tablica));
        return tablica;

    }
    public static void minMaxTablica(int [] tab){
        int minTablicy = Integer.MAX_VALUE;
        int maxTablicy = Integer.MIN_VALUE;
        for (int ints : tab) {
                if (ints < minTablicy)
                    minTablicy = ints;
                if (ints > maxTablicy)
                    maxTablicy = ints;
        }
        System.out.println("Minimum tablicy: " + minTablicy +" maksimum tablicy: " + maxTablicy);

    }


    public static void trzyNajwieksze (int [] tab){
        int najwieksza = Integer.MIN_VALUE;
        int wielka = Integer.MIN_VALUE;
        int duza = Integer.MIN_VALUE;

        for (int ints : tab) {
            if (ints > najwieksza) {
                duza = wielka;
                wielka = najwieksza;
                najwieksza = ints;
                continue;
            }
            else if (ints > wielka){
                duza = wielka;
                wielka = ints;
                continue;
            }
            else if (ints > duza){
                duza = ints;
            }

        }
        System.out.println("Trzy największe liczby w tabeli to " + najwieksza + " " + wielka + " " + duza);

    }

    public static double srednia (int [] tab){
        int suma = 0;

        for (int ints : tab){
            suma += ints;
        }
        double srednia = (double) suma / tab.length;
        return srednia;
    }

    public static void wyswietlTabliceOdwrotnie (int [] tab){
        int counter=0;
        for (int i = tab.length-1; i >= 0  ; i--) {
            ++counter;
            System.out.print(tab[i] + " ");

            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }

    }

    public static  int[] odwrocTablice (int [] tab){
        int [] tablica = new int[tab.length];
        int indexTab = tab.length - 1;
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = tab[indexTab];
            indexTab--;
        }

        return tablica;

    }



}
