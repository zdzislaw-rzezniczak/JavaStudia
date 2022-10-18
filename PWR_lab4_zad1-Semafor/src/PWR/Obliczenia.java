package PWR;

import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread {

    private final Dane dane;
    private Semaphore s1;

    public Obliczenia(Dane dane, Semaphore s1) {
        this.dane = dane;
        this.s1 = s1;
    }

    @Override
    public void run() {
        try {
            s1.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int c = dane.getA() + dane.getB();
        System.out.println(c);
    }

}
