package PWR;

import java.util.concurrent.BlockingQueue;

public class Pakowacz extends Thread{

    private static BlockingQueue<Integer> kolejka;

    public Pakowacz(String nazwa, BlockingQueue kolejka) {
        super(nazwa);
        this.kolejka = kolejka;
    }

    @Override
    public void run() {
        try {
            while(true){
                System.out.println("Pakowacz czeka na ciastko");
                Integer x = kolejka.take();
                Thread.sleep(1100);
                System.out.println(Thread.currentThread().getName() + " zdjął ciastko " + x + " zostało -> " + kolejka.remainingCapacity());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
