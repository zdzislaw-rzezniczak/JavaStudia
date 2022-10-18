package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj z ilu liczb losować ");
        int pulaLiczb = in.nextInt();

        System.out.print("Ile liczb losować ");
        int ileLiczbLosowanych = in.nextInt();

        int[] wynikLosowania = new int[ileLiczbLosowanych];

        for (int i=0; i<ileLiczbLosowanych; i++){
            int rand = (int) (Math.random() * pulaLiczb + 1);

            //TODO wyeliminować zdublowane numery........
            {wynikLosowania[i] = rand;}

        }

        Arrays.sort(wynikLosowania);
        System.out.println("Wylosowane liczby to : ");
        System.out.println(Arrays.toString(wynikLosowania));
    }
}
