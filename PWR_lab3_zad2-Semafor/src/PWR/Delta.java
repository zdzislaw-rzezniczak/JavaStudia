package PWR;

import java.util.concurrent.Semaphore;

public class Delta extends Thread{
    private Semaphore s1;
    private Semaphore s2;
    private Dane dane;
    private double delta;

    public Delta(Semaphore s1, Semaphore s2, Dane dane) {
        this.s1 = s1;
        this.s2 = s2;
        this.dane = dane;
    }

    public double getDelta() {
        return delta;
    }

    @Override
    public void run() {
        try {
            s1.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int a = dane.getA();
        int b = dane.getB();
        int c = dane.getC();
        delta = Math.pow(b,2) -4 * a * c;
        System.out.println("delta = " + delta);
        s2.release();

    }
}
