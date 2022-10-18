package PWR;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class PakowaczZ3 extends Thread{

    private static BlockingQueue<Integer> kolejka;
    private static BlockingQueue<Integer> kolejka2;
    private static AtomicInteger serial = new AtomicInteger(1);

    public PakowaczZ3(String nazwa, BlockingQueue kolejka, BlockingQueue kolejka2) {
        super(nazwa);
        this.kolejka = kolejka;
        this.kolejka2 = kolejka2;
    }

    @Override
    public void run() {
        try {
            while(true){
                System.out.println("Pakowacz czeka na 2 ciastka");
                Integer x = kolejka.take();
                System.out.println(Thread.currentThread().getName() + " zdjął pierwsze ciastko " + x + " zostało -> " + kolejka.remainingCapacity());
                Integer y = kolejka.take();
                System.out.println(Thread.currentThread().getName() + " zdjął drugie ciastko " + x + " zostało -> " + kolejka.remainingCapacity());

//
//                Thread.sleep(1100);
                Integer pakiet = serial.getAndIncrement();
                kolejka2.put(pakiet);
                System.out.println(Thread.currentThread().getName() +  " położył pakiet 2 ciasteczek: " + pakiet);
                Thread.sleep(1000);


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
