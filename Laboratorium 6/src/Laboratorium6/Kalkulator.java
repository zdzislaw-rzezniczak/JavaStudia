package Laboratorium6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Kalkulator {

    private static final Scanner sc = new Scanner(System.in);
    private char dzialanie = '0';
    private final ArrayList <Integer> liczby = new ArrayList<>();
    private final int wersja;
    private double wynik =0;
    private double srednia = 0;

    public char getDzialanie() {
        return dzialanie;
    }

    public double getWynik() {
        return wynik;
    }

    public double getSrednia() {
        return srednia;
    }

    public ArrayList<Integer> getLiczby() {
        return liczby;
    }
    public Kalkulator(char dzialanie) {
        this.dzialanie = dzialanie;
        wersja = 1;
    }

    public Kalkulator(int a, int b, int c, int d) {
        liczby.add(a);
        liczby.add(b);
        liczby.add(c);
        liczby.add(d);
        wersja = 2;

    }

    public Kalkulator(int a, int b, int c, int d, int e, int f, int g) {
        wersja = 3;
        liczby.add(a);
        liczby.add(b);
        liczby.add(c);
        liczby.add(d);
        liczby.add(e);
        liczby.add(f);
        liczby.add(g);

    }

    public void liczenie() {

        if (wersja == 1) {
            System.out.println("wybrane działanie to: " + dzialanie);
            System.out.println("Podaj liczby, jakie chcesz " + dzialanie);
            System.out.println("podaj liczę pierwszą ");
            liczby.add(sc.nextInt());
            sc.nextLine();
            System.out.println("podaj liczę drugą ");
            liczby.add(sc.nextInt());
            sc.nextLine();


            switch (dzialanie) {
                case '+' -> wynik = liczby.get(0) + liczby.get(1);
                case '*' -> wynik = liczby.get(0) * liczby.get(1);
                case '-' -> wynik = liczby.get(0) - liczby.get(1);
                case '/' -> {
                    if (liczby.get(1) != 0)
                        wynik = liczby.get(0) / liczby.get(1);
                    else {
                        System.out.println("Dzielnik nie może być zerowy");
                    }
                }
            }
            System.out.println("Wynik = " + wynik);
        }
        if (wersja == 2) {
            System.out.println("Jakie działanie chcesz wykonać na liczbach? + - *");
            dzialanie = sc.nextLine().charAt(0);
            switch (dzialanie) {
                case '+' -> {
                    for (int i = 0; i < liczby.size(); i++) {
                        wynik += liczby.get(i);
                    }
                }
                case '*' -> {
                    wynik = 1;
                    for (int i = 0; i < liczby.size(); i++) {
                        wynik *= liczby.get(i);
                    }
                }
                case '-' -> {
                    for (int i = 0; i < liczby.size(); i++) {
                        wynik -= liczby.get(i);
                    }
                }

            }
            System.out.println("Wynik = " + wynik);
        }
        if (wersja == 3) {
            System.out.println("Program wylicza średnią.");
            System.out.println("Jaką średnią chcesz wyliczyć");
            System.out.println("1. Srednia arytmetyczna");
            System.out.println("2. Srednia geometryczna");
            System.out.println("3. Srednia harmoniczna");
            int wybor = sc.nextInt();
            int suma = 0;
            int iloczyn = 1;


            switch (wybor){
                case 1 -> {
                    for (int i = 0; i < liczby.size() - 1; i++) {
                        suma += liczby.get(i);
                    }
                    srednia = (double) suma / liczby.size();
                    System.out.println("Srednia arytmetyczna = " + srednia);
                }
                case 2 -> {
                    for (int i = 0; i < liczby.size() - 1; i++) {
                        iloczyn *= liczby.get(i);
                    }
                    srednia = Math.sqrt(iloczyn);
                    System.out.println("Srednia geometryczna = " + srednia);
                }

                case 3 -> {
                    for (int i = 0; i < liczby.size() - 1; i++) {
                     suma += 1 / liczby.get(i);
                }
                    srednia = (double) liczby.size() / suma;
                    System.out.println("Srednia harmoniczna = " + srednia);

                }
            }


        }

    }
}
