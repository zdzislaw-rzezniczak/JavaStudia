package PWR;

import java.util.concurrent.BlockingQueue;

public class Paleciarz extends Thread{

    private static BlockingQueue<Integer> kolejka;

    public Paleciarz(String nazwa, BlockingQueue kolejka) {
        super(nazwa);
        Paleciarz.kolejka = kolejka;
    }

    @Override
    public void run() {
        try {
            while(true){
                System.out.println("Paleciarz czeka na pakiet dwóch ciastek");
                Integer pakietCiastek = kolejka.take();
                Thread.sleep(1100);
                System.out.println(Thread.currentThread().getName() + " zdjął pakiet i położył na palecie " + pakietCiastek + " zostało na drugiej taśmie -> " + kolejka.remainingCapacity());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
