//Zdzisław Rzeźniczak 103610 25.04.2021

package PWR;

import java.util.concurrent.Semaphore;

public class Pole extends Thread{
    private Semaphore s1;
    private int pole;
    private Watek watek;

    public Pole(Semaphore s1, Watek watek) {
        this.s1 = s1;
        this.watek = watek;

    }

    @Override
    public void run() {
        try {
            s1.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pole = watek.getA() * watek.getB();
        System.out.println("Pole prostokata wynosi : " + pole);
        s1.release();

    }
}