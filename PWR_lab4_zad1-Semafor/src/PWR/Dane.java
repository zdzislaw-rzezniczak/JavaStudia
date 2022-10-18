package PWR;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane extends Thread{
    public static Scanner sc = new Scanner(System.in);
    private Semaphore s1;
    private int a;
    private int b;

    public Dane(Semaphore s1) {
        this.s1 = s1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public void run() {
        System.out.println("podaj liczbę a: ");
        a = sc.nextInt();
        System.out.println("podaj liczbę b: ");
        b = sc.nextInt();
        s1.release();
    }
}
