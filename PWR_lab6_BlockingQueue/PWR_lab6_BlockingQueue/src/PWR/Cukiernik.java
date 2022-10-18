package PWR;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Cukiernik extends Thread{


    private static AtomicInteger serial = new AtomicInteger(1);
    private static BlockingQueue<Integer> kolejka;

    public Cukiernik(String nazwa, BlockingQueue kolejka) {
        super(nazwa);
        this.kolejka = kolejka;
    }

    @Override
    public void run() {
        try {
            while (true){
                Integer id = serial.getAndIncrement();
                kolejka.put(id);
                System.out.println(Thread.currentThread().getName() +  " położył ciastko: " + id);
                Thread.sleep(1000);
                }
            }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
