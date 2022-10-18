package Lab10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczby, które chcesz podzielić");
        System.out.println("Podaj dzielną");

        int dzielna = sc.nextInt();
        System.out.println("Podaj dzielnik");
        int dzielnik = sc.nextInt();

        try
        {
            int wynik = dzielna / dzielnik;
            System.out.println("wynik dzielenia = " + wynik);
        } catch (ArithmeticException e) {
            System.out.println("Niestety nie dzielimy przez 0");
        } finally {
            sc.close();
        }

    }
}
