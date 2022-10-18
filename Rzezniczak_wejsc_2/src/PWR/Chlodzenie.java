package PWR;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Chlodzenie extends Thread{

    private static BlockingQueue<Integer> kolejka;
    private static BlockingQueue<Integer> kolejka2;
    private static AtomicInteger serial = new AtomicInteger(1);

    public Chlodzenie(String nazwa, BlockingQueue kolejka, BlockingQueue kolejka2) {
        super(nazwa);
        this.kolejka = kolejka;
        this.kolejka2 = kolejka2;
    }

    @Override
    public void run() {
        try {
            while(true){

                Integer a = kolejka.take();
                System.out.println(Thread.currentThread().getName() + " pobrano obudowe pobrana do chlodzenia " + a + " zostało -> " + kolejka.remainingCapacity());
                Integer b = kolejka.take();
                System.out.println(Thread.currentThread().getName() + " pobrano obudowe pobrana do chlodzenia " + b + " zostało -> " + kolejka.remainingCapacity());
                Integer c = kolejka.take();
                System.out.println(Thread.currentThread().getName() + " pobrano obudowe pobrana do chlodzenia " + c + " zostało -> " + kolejka.remainingCapacity());
                Integer d = kolejka.take();
                System.out.println(Thread.currentThread().getName() + " pobrano obudowe pobrana do chlodzenia " + d + " zostało -> " + kolejka.remainingCapacity());
                System.out.println("trwa chlodzenie");
                Thread.sleep(300);

                System.out.println(Thread.currentThread().getName() +  " Pakiet schlodzony schlodzony do 30 stopni pakiet 4 sztuk umieszczamy na  na stol montazowy: ");
                Integer pakiet = serial.getAndIncrement();
                kolejka2.put(pakiet);


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}