package PWR;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę domowników");
        int liczbaDomownikow = sc.nextInt();
        System.out.println("Podaj liczbę telefonów w domostwie: ");
        int liczbaTelefonow = sc.nextInt();
        Semaphore s1 = new Semaphore(liczbaTelefonow);
        Domownik [] domownicy =  new Domownik[liczbaDomownikow];
        for (int i = 0; i < liczbaDomownikow; i++) {
            domownicy[i] = new Domownik(s1);
        }

        for (int i = 0; i < liczbaDomownikow; i++) {
            domownicy[i].start();
        }


    }
}
