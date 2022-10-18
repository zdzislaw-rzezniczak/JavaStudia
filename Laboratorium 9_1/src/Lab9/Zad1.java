package Lab9;

import java.time.LocalDate;

class Watek implements Runnable {

    private int id;
    LocalDate biezacaData = LocalDate.now();

    public Watek(int id) {
        this.id = id;
    }

    @Override
    public void run() {
            System.out.println("Watek "+id + " " + biezacaData);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

public class Zad1 {
    public static void main(String[] args) {
        Runnable[] runners = new Runnable[15];
        Thread[] threads = new Thread[15];

        for(int i=0; i<15; i++) {
            runners[i] = new Watek(i);
        }

        for(int i=0; i<15; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for(int i=0; i<15; i++) {
            threads[i].start();
        }
    }
}