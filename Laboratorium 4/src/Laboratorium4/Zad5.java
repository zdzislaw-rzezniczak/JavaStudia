package Laboratorium4;

import java.util.Arrays;
import java.util.Random;

public class Zad5 {

    public static void tablicaZakresowa(){
        int [] tablica = generujTablice();
        System.out.println(Arrays.toString(tablica));
    }

    private static int [] generujTablice(){
        int [] tablica1 = new int[40];
        Random rand = new Random();
        for (int i = 0; i < tablica1.length; i++){
            if ( i <=10)
                tablica1[i] = rand.nextInt((5 - 1) + 1) + 1;
            if ( i >=11 && i <=20)
                tablica1[i] = rand.nextInt((10 - 6) + 1) + 6;
            if ( i >=21 && i <=30)
                tablica1[i] = rand.nextInt((55 - 11) + 1) + 11;
            if ( i >=31)
                tablica1[i] = rand.nextInt((75 - 60) + 1) + 60;
        }
        return tablica1;
    }

}
