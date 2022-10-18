package Laboratorium4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Zad789 {

    public static void tablice() {
        int[][] tablicaPrzekatna = generujTablicePrzekatna();
        wyswietlTablice2w(tablicaPrzekatna);
        int[][] tablica = generujTabliceLosowa();
        wyswietlTablice2w(tablica);
        int[][] tablicaPolaczona = polaczTablice(tablicaPrzekatna, tablica);
        wyswietlTablice2w(tablicaPolaczona);

        int [][] babelkowaTablica = tablicaPolaczona.clone();
        sortowanieBabelkowe(babelkowaTablica);
        wyswietlTablice2w(babelkowaTablica);

        int[] tablicaQuick = konwersja2dto1D(tablicaPolaczona.clone());
        quickSort(tablicaQuick, 0, tablicaQuick.length-1);
        System.out.println(Arrays.toString(tablicaQuick));


    }

    private static int[][] polaczTablice(int[][] tab1, int[][] tab2) {

        int[][] tab = new int[tab1.length + tab2.length][];

        System.arraycopy(tab1, 0, tab, 0, tab1.length);
        System.arraycopy(tab2, 0, tab, tab1.length, tab2.length);

        return tab;
    }

    private static int[][] generujTablicePrzekatna() {
        int[][] tab = new int[12][12];
        int min = 1;
        int max = 999;
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i == j) {
                    tab[i][j] = i;
                } else {
                    tab[i][j] = rand.nextInt((max - min) + 1) + min;
                }

            }
        }
        return tab;
    }

    private static int[][] generujTabliceLosowa() {
        int[][] tab = new int[12][12];
        int min = 0;
        int max = 999;
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
        return tab;
    }

    private static void wyswietlTablice2w(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(Arrays.toString(tab[i]));
        }
        System.out.println();
    }

    private static void sortowanieBabelkowe(int tab[][]) {
        int i, j, temp;
        int licznik = 0;
        int n = tab.length;
        int m = tab[0].length;

        for (i = 0; i < n * m - 1; ++i) {
            for (j = 0; j < n * m - 1 - i; ++j) {
                if (tab[j / m][j % m] > tab[(j + 1) / m][(j + 1) % m]) {

                    temp = tab[(j + 1) / m][(j + 1) % m];
                    tab[(j + 1) / m][(j + 1) % m] = tab[j / m][j % m];
                    tab[j / m][j % m] = temp;
                    ++licznik;
                }
                if (licznik < 5) {
                    System.out.println("Tablica po " + licznik + " przebiegu sortowania babelkowego");
                    wyswietlTablice2w(tab);
                }

            }
        }

    }

    private static int[] konwersja2dto1D(int[][] tab) {
        int[] tablica = new int[tab.length * tab[0].length];
        int i = 0;
        for (int j = 0; j < tab.length; j++) {
            for (int k = 0; k < tab[0].length; k++) {
                tablica[i] = tab[j][k];
                ++i;
            }
        }
        return tablica;
    }

    public static void quickSort(int[] tab, int start, int end) {

        int partition = partition(tab, start, end);

        if (partition - 1 > start) {
            quickSort(tab, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSort(tab, partition + 1, end);
        }
    }

    public static int partition(int[] tab, int start, int end) {
        int pivot = tab[end];

        for (int i = start; i < end; i++) {
            if (tab[i] < pivot) {
                int temp = tab[start];
                tab[start] = tab[i];
                tab[i] = temp;
                start++;
            }
        }

        int temp = tab[start];
        tab[start] = pivot;
        tab[end] = temp;

        return start;
    }

}




