package PWR;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
	int pojemnoscKolejki = 6;
	BlockingQueue<Integer> kolejka = new ArrayBlockingQueue<Integer>(pojemnoscKolejki);

	Pakowacz pakowacz = new Pakowacz("pakowacz1", kolejka);
	Cukiernik cukiernik = new Cukiernik("cukiernik1", kolejka);


	pakowacz.start();
	cukiernik.start();

    }
}
