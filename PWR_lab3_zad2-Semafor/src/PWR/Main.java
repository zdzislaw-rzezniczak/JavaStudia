package PWR;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Semaphore s1 = new Semaphore(0);
        Semaphore s2 = new Semaphore(0);

        Dane w1_dane = new Dane(s1);
        Delta w2_delta = new Delta(s1, s2, w1_dane);
        Pierwiastki w3_pierwiastki = new Pierwiastki(s2, w2_delta, w1_dane);

        w1_dane.start();
        w2_delta.start();
        w3_pierwiastki.start();
    }


}
