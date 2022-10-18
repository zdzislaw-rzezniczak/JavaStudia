package PWR;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Podaj rozmiar macierzy");
        Scanner sc = new Scanner(System.in);
        final int SIZE = sc.nextInt();
        sc.close();
        int[][] A = Macierze.generujMacierz(SIZE);
        int[][] B = Macierze.generujMacierz(SIZE);
        System.out.println("Macierz A");
        Macierze.wyswietlTablice2w(A);
        System.out.println("Macierz B");
        Macierze.wyswietlTablice2w(B);

        int[][] C = Macierze.mnozenieMacierz(A, B, SIZE);
        Macierze.wyswietlTablice2w(C);

        int [][] D = new int [SIZE][SIZE];

        Watek w1 = new Watek(A, B, SIZE, 0, D);
        Watek w2 = new Watek(A, B, SIZE, 1, D);
        Watek w3 = new Watek(A, B, SIZE, 2, D);
        Watek w4 = new Watek(A, B, SIZE, 3, D);

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w1.join();
        w2.join();
        w3.join();
        w4.join();

        D = Watek.getWynik();
        Macierze.wyswietlTablice2w(D);
        System.out.println(Arrays.equals(D, C));


    }
}

