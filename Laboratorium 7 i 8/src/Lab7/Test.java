package Lab7;

import java.util.Scanner;

public class Test {
    public static void utworzStudent(){
        StudentInstytut nowy = new StudentInstytut();
        Scanner sc = new Scanner (System.in);
        System.out.println("Podaj imię: ");
        nowy.ustawImie(sc.next());
        sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        nowy.ustawNazwisko(sc.next());
        sc.nextLine();
        System.out.println("Podaj numer indeksu: ");
        nowy.ustawNumerIndeksu(sc.nextInt());
        sc.nextLine();
        System.out.println("Podaj wydział: ");
        nowy.ustawWydział(sc.next());
        sc.nextLine();
        System.out.println("Podaj instytut: ");
        nowy.ustawInstytut(sc.next());
        sc.nextLine();


        sc.close();
    }
}
