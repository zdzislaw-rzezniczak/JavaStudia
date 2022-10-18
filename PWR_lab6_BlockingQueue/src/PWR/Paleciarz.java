package PWR;

import java.util.concurrent.BlockingQueue;

public class Paleciarz extends Thread{

    private static BlockingQueue<Integer> kolejka2;

    public Paleciarz(String nazwa, BlockingQueue kolejka2) {
        super(nazwa);
        Paleciarz.kolejka2 = kolejka2;
    }

    @Override
    public void run() {
        try {
            while(true){
                System.out.println("Paleciarz czeka na pakiet dwóch ciastek");
                Integer pakietCiastek = kolejka2.take();
                System.out.println(Thread.currentThread().getName() + " zdjął pakiet i położył na palecie " + pakietCiastek + " zostało na drugiej taśmie -> " + kolejka2.remainingCapacity());
                Integer pakietCiastek2 = kolejka2.take();
                System.out.println(Thread.currentThread().getName() + " zdjął pakiet i położył na palecie " + pakietCiastek2 + " zostało na drugiej taśmie -> " + kolejka2.remainingCapacity());
                Integer pakietCiastek3 = kolejka2.take();
                System.out.println(Thread.currentThread().getName() + " zdjął pakiet i położył na palecie " + pakietCiastek3 + " zostało na drugiej taśmie -> " + kolejka2.remainingCapacity());
                Integer pakietCiastek4 = kolejka2.take();
                System.out.println(Thread.currentThread().getName() + " zdjął pakiet i położył na palecie " + pakietCiastek4 + " zostało na drugiej taśmie -> " + kolejka2.remainingCapacity());
                System.out.println("Paleta pełna jadę na MWG");

                Thread.sleep(2000);


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
