package Laboratorium3;

import java.util.Scanner;

public class Zad4 {  public static double wczytajPiec () {
    int liczba;
    double iloczyn=1;

    Scanner sc = new Scanner(System.in);
    do {
        System.out.print("Podaj liczbe: ");
        liczba = sc.nextInt();
        sc.nextLine();
        iloczyn *= liczba;
    }
    while (liczba != 5);

    sc.close();

    return iloczyn;
}



}
