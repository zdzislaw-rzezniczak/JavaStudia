package PWR;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Watek.generujTablice();
        int liczbaWatkow = 8;
        Watek.setZakres(liczbaWatkow);
        Watek.generujwatki(liczbaWatkow);
        long startTime = System.nanoTime();

        long stopTime = System.nanoTime();
        System.out.println("Elapsed time " + (stopTime - startTime) + " liczba watkow " + liczbaWatkow);

    }
}

//Elapsed time 300 liczba watkow 1
//Elapsed time 200 liczba watkow 2
//Elapsed time 100 liczba watkow 4
//Elapsed time 200 liczba watkow 6
//Elapsed time 200 liczba watkow 8

// Pamięć RAM 16GB, Windows 10, Procesor Intel I5 Liczba rdzeni 4

