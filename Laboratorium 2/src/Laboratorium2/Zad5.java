package Laboratorium2;

import java.util.Scanner;

public class Zad5 {
    public static void Kalkulator (int liczba1, int liczba2){
        System.out.println("jakie działanie chcesz wykonać");
        System.out.println("Dodawanie: 1");
        System.out.println("Odejmowanie 2");
        System.out.println("Mnożenie 3");
        System.out.println("Dzielenie 4");
        Scanner sc =new Scanner(System.in);

        int wybor = sc.nextInt();
        sc.close();
        double wynik = 0;

        switch (wybor){
            case 1:
                wynik = liczba1 + liczba2;
                break;
            case 2:
                wynik = liczba1 - liczba2;
                break;
            case 3:
                wynik = liczba1 * liczba2;
                break;
            case 4:
                if (liczba2 == 0){
                    System.out.println("Nie można dzielić przez zero");
                    return;

                }
                else {
                    wynik = liczba1 / liczba2;
                }

                break;
            default:
                System.out.println("Brak działania");
                return;
        }


        System.out.println("wynik:" + wynik );
    }
}
