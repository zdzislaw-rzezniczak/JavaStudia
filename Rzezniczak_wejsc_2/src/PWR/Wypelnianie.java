package PWR;

import java.util.concurrent.BlockingQueue;

public class Wypelnianie extends Thread{

    private static BlockingQueue<Integer> stolmontazowy;

    public Wypelnianie(String nazwa, BlockingQueue kolejka2) {
        super(nazwa);
        this.stolmontazowy = kolejka2;
    }

    @Override
    public void run() {

        try {
            while(true){
                Integer obudowa = stolmontazowy.take();
                System.out.println(Thread.currentThread().getName() + " obudowa pobrana do montazu " + obudowa + " zostało na drugiej taśmie -> " + stolmontazowy.remainingCapacity());
                Integer obudowa2 = stolmontazowy.take();
                System.out.println(Thread.currentThread().getName() + " obudowa pobrana do montazu " + obudowa2 + " zostało na drugiej taśmie -> " + stolmontazowy.remainingCapacity());
                System.out.println("Wklady umieszczone do dwóch obudów");

                Thread.sleep(200);


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
