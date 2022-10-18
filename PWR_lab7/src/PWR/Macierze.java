package PWR;

import java.util.Arrays;
import java.util.Random;

class Macierze {

    public static int[][] generujMacierz(int SIZE) {
        int[][] tab = new int[SIZE][SIZE];
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

    public static void wyswietlTablice2w(int[][] macierz) {

        for (int[] ints : macierz) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
    }

    public static int[][] mnozenieMacierz(int[][] macierz1, int[][] macierz2, int SIZE) {
        int[][] wynik = new int[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int k = 0; k < SIZE; k++) {
                    wynik[i][j] += macierz1[i][k] * macierz2[k][j];
                }
            }
        }
        return wynik;
    }

}
