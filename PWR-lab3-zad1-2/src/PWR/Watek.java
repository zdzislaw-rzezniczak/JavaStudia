package PWR;

import java.util.*;

public class Watek extends Thread {



    private static int[] tablica;
    private static int zakres;
    private static final int dlugoscTablicy = 3200000;
    private static int count = 0;
    private static int maxTab = Integer.MIN_VALUE;
    private static int minTab = Integer.MAX_VALUE;

    public static void generujTablice() {
        Random rand = new Random();
        tablica = new int[dlugoscTablicy];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(10000);
        }
    }

    public static void generujwatki(int liczbaWatkow) {

        zakres = dlugoscTablicy / liczbaWatkow;

        Runnable[] runners = new Runnable[liczbaWatkow];
        Thread[] threads = new Thread[liczbaWatkow];
        for(int i=0; i<liczbaWatkow; i++) {
            runners[i] = new Watek();
        }

        for(int i=0; i<liczbaWatkow; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for(int i=0; i<liczbaWatkow; i++) {
            threads[i].start();
        }
    }

        public synchronized void szukajMinMax (int [] tab, int poczatekSzukania){

            synchronized (this){
                for (int i = poczatekSzukania; i < poczatekSzukania + zakres; i++) {
                    if (tab[i] < minTab) {
                        minTab = tab[i];
                    }

                    if (tab[i] > maxTab){
                        maxTab = tab[i];
                    }
            }
        }

    }

    @Override
    public void run() {

        int poczatekSzukania = count++ * zakres;
        szukajMinMax(tablica, poczatekSzukania);

    }

}
