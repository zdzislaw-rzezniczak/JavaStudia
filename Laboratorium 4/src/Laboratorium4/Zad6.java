package Laboratorium4;

import java.util.Arrays;

public class Zad6 {
    public static void alfabet () {
        char [] [] tablica = generujTablice();
        wyswietlTablice2w(tablica);



    }
    private static char [][] generujTablice(){
        char [][] tab = new char [6][4];
        int litera = 97;
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                    tab[i][j] = (char) litera;
                    litera++;
            }
        }
        return tab;
    }

    private static void wyswietlTablice2w(char [][] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(Arrays.toString(tab[i]));
        }
        System.out.println();
    }

}
