package Laboratorium4;

import java.util.Arrays;
import java.util.Random;

public class Zad3 {
    public static void tablicaPrawdy(){
        boolean[] tablica = generujTablice();
        System.out.println(Arrays.toString(tablica));

    }

    private static boolean [] generujTablice(){
        boolean [] tab = new boolean[40];
        for (int i = 0; i < tab.length; i++){
            if (i % 2 == 0){
                tab[i] = true;
            } else{
                tab[i] = false;
            }
        }
        return tab;
    }



}
