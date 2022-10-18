package PWR;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainZad2 {


    public static void main(String[] args) {
        int pojemnoscKolejki = 6;
        BlockingQueue<Integer> kolejka = new ArrayBlockingQueue<Integer>(pojemnoscKolejki);


        Pakowacz pakowacz1 = new Pakowacz("pakowacz1", kolejka);
        Pakowacz pakowacz2 = new Pakowacz("pakowacz2", kolejka);
        Pakowacz pakowacz3 = new Pakowacz("pakowacz3", kolejka);
        Pakowacz pakowacz4 = new Pakowacz("pakowacz4", kolejka);
        Pakowacz pakowacz5 = new Pakowacz("pakowacz5", kolejka);
        Cukiernik cukiernik1 = new Cukiernik("cukiernik1", kolejka);
        Cukiernik cukiernik2 = new Cukiernik("cukiernik2", kolejka);
        Cukiernik cukiernik3 = new Cukiernik("cukiernik3", kolejka);
        Cukiernik cukiernik4 = new Cukiernik("cukiernik4", kolejka);
        Cukiernik cukiernik5 = new Cukiernik("cukiernik5", kolejka);


        pakowacz1.start();
        pakowacz2.start();
        pakowacz3.start();
        pakowacz4.start();
        pakowacz5.start();
        cukiernik1.start();
        cukiernik2.start();
        cukiernik3.start();
//        cukiernik4.start();
//        cukiernik5.start();

    }
}
