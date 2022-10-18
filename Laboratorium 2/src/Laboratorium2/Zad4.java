package Laboratorium2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zad4 {
    public static void wyznaczMinMax(){
        List<Integer> lista = new ArrayList<>();
        boolean czyDodac = true;
        int x;
        char wybor = 'T';
        Scanner sc = new Scanner(System.in);
        while (czyDodac){
            x = sc.nextInt();
            lista.add(x);
            System.out.println("Chceszdodać kolejną T/N?");
            wybor = sc.next().toUpperCase().charAt(0);
            if (wybor == 'N') czyDodac = false;
        }
        sc.close();
        int max = Collections.max(lista);
        int min = Collections.min(lista);
        System.out.println("Minimum: " + min + "Maksimum: " + max);
    }
}
