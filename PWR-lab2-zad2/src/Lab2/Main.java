package Lab2;

import java.nio.channels.ScatteringByteChannel;

public class Main {

    public static void main(String[] args) {
	int tnum = Integer.parseInt (args[0]);
	int count = Integer.parseInt(args[1]);

	LicznikWatkow licznik = new LicznikWatkow();

	WatekLiczacy[] thread = new WatekLiczacy[tnum];

        for (int i = 0; i < tnum; i++)
            thread[i] = new WatekLiczacy("Watek" + (i + 1), licznik, count);

        try {
            for (int i = 0; i < tnum ; i++) {thread[i].join();}
            }catch (InterruptedException exc) {
                System.exit(1);}
        System.out.println("Koniec programu");
        }
}