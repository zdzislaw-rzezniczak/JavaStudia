//Zdzisław Rzeźniczak 103610 25.04.2021

package PWR;

import java.util.concurrent.Semaphore;

public class Obwod extends Thread{
    private Semaphore s1;
    private int obwod;
    private Watek watek;

    public Obwod(Semaphore s1, Watek watek) {
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
        obwod = 2* watek.getA()  + 2 * watek.getB();
        System.out.println("Obwód prostokata wynosi: " + obwod);
        s1.release();
    }
}