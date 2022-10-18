package PWR;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore s1 = new Semaphore(1);
        Domownik w1 = new Domownik(s1);
        Domownik w2 = new Domownik(s1);
        Domownik w3 = new Domownik(s1);
        w1.setName("Ojciec");
        w2.setName("Matka");
        w3.setName("Dzieciak");
        w1.start();
        w2.start();
        w3.start();


    }
}
