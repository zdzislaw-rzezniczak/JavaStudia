//Zdzisław Rzeźniczak 103610 25.04.2021

package PWR;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
            Semaphore s1 = new Semaphore(0);

            Watek w1 = new Watek(s1);
            Pole w2 = new Pole(s1, w1);
            Obwod w3 = new Obwod(s1, w1);

            w1.start();
            w2.start();
            w3.start();

    }
}
