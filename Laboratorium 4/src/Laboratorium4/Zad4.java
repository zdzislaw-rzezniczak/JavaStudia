package Laboratorium4;

import java.util.Arrays;
import java.util.Random;

public class Zad4 {
    public static void tabliczkaMnozenia(){
        int [][] tablica = generujTabliczkeMnozenia();
        wyswietlTablice2w(tablica);
        double [][] tabSrednia = tablicaSredniaKolumny(tablica);
        wyswietlTablice2w(tabSrednia);
    }
    private static double [][] tablicaSredniaKolumny(int[][] tab){
        double [][] tablica = new double [1][15];
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j<tab[0].length; j++){
                suma += tab[j][i];
            }
            tablica [0][i] = (double) suma / tab.length;
            suma = 0;
        }
        return tablica;

    }
    private static int [][] generujTabliczkeMnozenia(){
        int [][] tab = new int [15][15];
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                if (i == 0)
                    tab[i][j] = j;
                if (j == 0)
                    tab[i][j] = i;
            }
        }

        for (int i = 1; i < tab.length; i++){
            for (int j = 1; j < tab[i].length; j++){

                    tab[i][j] = tab[0][i] * tab [j] [0];
            }
        }

        return tab;
    }

    private static void wyswietlTablice2w(int [][] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(Arrays.toString(tab[i]));
        }
        System.out.println();
    }

    private static void wyswietlTablice2w(double [][] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(Arrays.toString(tab[i]));
        }
        System.out.println();
    }

}
