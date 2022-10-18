package PWR;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Dane extends Thread {
    private Semaphore s1;
    private int a;
    private int b;
    private int c;

    public Dane(Semaphore s1) {
        this.s1 = s1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = sc.nextInt();
        System.out.println("Podaj b: ");
        b = sc.nextInt();
        System.out.println("Podaj c: ");
        c = sc.nextInt();
        s1.release();

    }
}
