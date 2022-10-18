package PWR;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

    	Semaphore s1 = new Semaphore(0);
	Dane watek_dane = new Dane(s1);
	Obliczenia watek_obliczenia = new Obliczenia(watek_dane, s1);

	watek_dane.start();
	watek_obliczenia.start();

    }
}
