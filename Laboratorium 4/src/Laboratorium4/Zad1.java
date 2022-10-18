package Laboratorium4;

import java.util.Arrays;
import java.util.Random;

public class Zad1 {

    public static void programKopiujacyTablice (){

        int [] tab1 = generujLosowaTablice();
        int [] kopiaTablicy = tab1.clone();
        System.out.println("pierwotna tablica");
        System.out.println(Arrays.toString(tab1));
        System.out.println();
        System.out.println("tablica skopiowana");
        System.out.println(Arrays.toString(kopiaTablicy));

    }

    public static int [] generujLosowaTablice(){
        int [] tablica1 = new int[30];
        int min = 99;
        int max = 150;
        Random rand = new Random();
        for (int i = 0; i < tablica1.length; i++){
            tablica1[i] = rand.nextInt((max - min) + 1) + min;
        }
        return tablica1;

    }


}
