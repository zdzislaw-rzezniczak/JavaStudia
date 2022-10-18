package PWR;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainZad3 {

    public static void main(String[] args) {
        int pojemnoscKolejki = 6;
        BlockingQueue<Integer> kolejka = new ArrayBlockingQueue<Integer>(pojemnoscKolejki);
        BlockingQueue<Integer> kolejka2 = new ArrayBlockingQueue<Integer>(pojemnoscKolejki);


        PakowaczZ3 pakowacz1 = new PakowaczZ3("pakowacz1", kolejka, kolejka2);
        PakowaczZ3 pakowacz2 = new PakowaczZ3("pakowacz2", kolejka, kolejka2);
        PakowaczZ3 pakowacz3 = new PakowaczZ3("pakowacz3", kolejka, kolejka2);
        PakowaczZ3 pakowacz4 = new PakowaczZ3("pakowacz4", kolejka, kolejka2);
        PakowaczZ3 pakowacz5 = new PakowaczZ3("pakowacz5", kolejka, kolejka2);
        Paleciarz paleciarz1 = new Paleciarz("paleciarz1", kolejka2);
        Paleciarz paleciarz2 = new Paleciarz("paleciarz2", kolejka2);
        Paleciarz paleciarz3 = new Paleciarz("paleciarz3", kolejka2);
        Paleciarz paleciarz4 = new Paleciarz("paleciarz4", kolejka2);
        Paleciarz paleciarz5 = new Paleciarz("paleciarz5", kolejka2);




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

        paleciarz1.start();
        paleciarz2.start();
        paleciarz3.start();
        paleciarz4.start();
        paleciarz5.start();

        cukiernik1.start();
        cukiernik2.start();
        cukiernik3.start();
        cukiernik4.start();
        cukiernik5.start();
    }
}
