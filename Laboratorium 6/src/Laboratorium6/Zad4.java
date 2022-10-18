package Laboratorium6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Zad4 {
    public static void zad4 () throws IOException {
        int [][] tab = generujLosowaTablice();
        zapiszTablice(tab);

    }

    public static int [][] generujLosowaTablice(){
        int [][] tab = new int [10][10];
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

    public static void zapiszTablice (int [][] tablica) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("macierz.csv", true));
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j<tablica[0].length; j++){
                sb.append(tablica[i][j]);
                if (j == tablica[0].length - 1){
                    sb.append(";");
                    sb.append("\n");
                } else
                    sb.append(",");
            }

        }

        br.write(sb.toString());
        br.close();
    }


}
