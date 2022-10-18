package Laboratorium4;

import java.util.Arrays;
import java.util.Random;

public class Zad2 {

    public static void operacjeNaTablicach(){
        int [][] tablica = generujLosowaTablice(7,7);
        wyswietlTablice2w(tablica);
        for (int j =0; j< 7; j++){
            minMaxKolumna(tablica, j);
        }

        minMaxTablica(tablica);
        sredniaTablicy(tablica);
        elementyMniejszeWiekszeSrednia(tablica);
        int [][] tablica2 = odwrocTablice(tablica);

        wyswietlTablice2w(tablica2);

    }
    public static int [][] generujLosowaTablice(int kolumny, int rzedy){
        int [][] tab = new int [kolumny][rzedy];
        int min = 0;
        int max = 999;
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                tab[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
        return tab;

    }
    public static int [][] odwrocTablice(int [][] tab){

        int liczbaRzedow = tab.length;
        int liczbaKolumn = tab[0].length;
        int [][]tablica = new int[liczbaRzedow][liczbaKolumn];
        for(int i = liczbaRzedow-1; i >= 0; i--) {
            for(int j = liczbaKolumn-1; j >= 0; j--) {
                tablica[liczbaRzedow-1-i][liczbaKolumn-1-j] = tab[i][j];
            }
        }
        return tablica;

    }
    public static void wyswietlTablice2w(int [][] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(Arrays.toString(tab[i]));
        }
        System.out.println();
    }

    public static void minMaxKolumna(int [][] tab, int kolumna){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i < tab.length; i++){
            if (tab [i][kolumna] < min){
                min = tab [i][kolumna];
            }
            if (tab [i][kolumna] > max){
                max = tab [i][kolumna];
            }
        }
        System.out.println("Kolumna " + kolumna +" minimum: " + min + " maksimum: " + max);

    }

    public static void minMaxTablica(int [][] tab){
        int minTablicy = Integer.MAX_VALUE;
        int maxTablicy = Integer.MIN_VALUE;
        for (int[] ints : tab) {
            for (int anInt : ints) {
                if (anInt < minTablicy)
                    minTablicy = anInt;
                if (anInt > maxTablicy)
                    maxTablicy = anInt;
            }
        }
        System.out.println("Minimum tablicy: " + minTablicy +" maksimum tablicy: " + maxTablicy);

    }

    public static double sredniaTablicy(int [][] tab){
        int sumaElementow =0;
        int liczbaElementow = tab.length * tab[0].length;

        for (int[] ints : tab) {
            for (int anInt : ints) {
                sumaElementow += anInt;
            }
        }
        double sredniaArytetyczna = (double) sumaElementow / (double)liczbaElementow;
        System.out.println("Srednia arytmetyczna tablicy: " + sredniaArytetyczna);
        return sredniaArytetyczna;
    }

    public static void elementyMniejszeWiekszeSrednia(int [][] tab){
        double srednia = sredniaTablicy(tab);
        int sumaMniejszych = 0;
        int sumaWiekszych = 0;
        for (int[] ints : tab) {
            for (int anInt : ints) {
                if (anInt < srednia){
                    sumaMniejszych++;
                }
                if (anInt > srednia){
                    sumaWiekszych++;
                }
            }
        }
        System.out.println("W tablicy jest " + sumaMniejszych + " elementow mniejszych od średniej oraz " +sumaWiekszych + " elementow wiekszych od średniej" );
    }
}
