package PWR;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Wytlaczanie extends Thread{


    private static AtomicInteger serial = new AtomicInteger(1);
    private static BlockingQueue<Integer> kolejka;

    public Wytlaczanie (String nazwa, BlockingQueue kolejka) {
        super(nazwa);
        this.kolejka = kolejka;
    }

    @Override
    public void run() {
        try {
            while (true){
                Integer id = serial.getAndIncrement();

                System.out.println(Thread.currentThread().getName() +  " Temperatura obudowy 150 stopni trafia na tassme" + id);
                kolejka.put(id);

            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}