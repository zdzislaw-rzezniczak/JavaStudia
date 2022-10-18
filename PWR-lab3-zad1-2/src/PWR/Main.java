package PWR;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws InterruptedException {

        Watek.generujTablice();
        int liczbaWatkow = 8;
        long startTime = System.nanoTime();
        Watek.generujwatki(liczbaWatkow);
        long stopTime = System.nanoTime();
        System.out.println("Elapsed time " + (stopTime - startTime) + " liczba watkow " +  liczbaWatkow);


        //Thread.sleep(400);
       // Watek.wyswietlListe();

        }


}
