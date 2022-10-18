package Lab1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ZADANIE 2
        //System.out.println(Bmi.obliczBmi());

        // ZADANIE 3

       /* if (LiczbaPierwsza.czyPierwsza())
            System.out.println("Podana liczba jest liczbą pierwszą");
        else
            System.out.println("Podana liczba nie jest liczbą pierwszą");*/

        // ZADANIE 4

        int[] tab = Tablica.stworzTablice();
        Tablica.minMaxTablica(tab);
        Tablica.trzyNajwieksze(tab);
        System.out.println("średnia tablicy wynosi: " + Tablica.srednia(tab));
        Tablica.wyswietlTabliceOdwrotnie(tab);

        int [] tablica = Tablica.odwrocTablice(tab);
        System.out.println(Arrays.toString(tablica));
    }
}
