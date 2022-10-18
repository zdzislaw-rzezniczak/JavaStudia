//Rzeźniczak Zdzisław
//103610
//30.05.2021

package PWR;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int pojemnoscKolejki = 12;
        int pojemnoscKolejki2 = 10;
        BlockingQueue<Integer> kolejkawytlaczanie = new ArrayBlockingQueue<Integer>(pojemnoscKolejki);
        BlockingQueue<Integer> kolejka2 = new ArrayBlockingQueue<Integer>(pojemnoscKolejki2);


        Wytlaczanie wytlaczarka1 = new Wytlaczanie("wytlaczarka1", kolejkawytlaczanie);
        Wytlaczanie wytlaczarka2 = new Wytlaczanie("wytlaczarka3", kolejkawytlaczanie);
        Wytlaczanie wytlaczarka3 = new Wytlaczanie("wytlaczarka3", kolejkawytlaczanie);




        Chlodzenie chlodziarka1 = new Chlodzenie("pakowacz2", kolejkawytlaczanie, kolejka2);

        Wypelnianie wypelniarka1 = new Wypelnianie("wypelniarka1", kolejka2);
        Wypelnianie wypelniarka2 = new Wypelnianie("wypelniarka2", kolejka2);

        wytlaczarka1.start();
        wytlaczarka2.start();
        wytlaczarka3.start();

        chlodziarka1.start();

        wypelniarka1.start();
        wypelniarka2.start();

    }
}
