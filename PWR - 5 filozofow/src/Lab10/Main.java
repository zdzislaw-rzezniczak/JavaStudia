package Lab10;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Semaphore nr1 = new Semaphore(1);
        Semaphore nr2 = new Semaphore(1);
        Semaphore nr3 = new Semaphore(1);
        Semaphore nr4 = new Semaphore(1);
        Semaphore nr5 = new Semaphore(1);
	    Widelec widjeden = new Widelec(nr1, 1);
	    Widelec widdwa = new Widelec(nr2, 2);
	    Widelec widtrzy = new Widelec(nr3, 3);
	    Widelec widcztery = new Widelec(nr4, 4);
	    Widelec widpiec = new Widelec(nr5, 5);
	    Filozof filozofPierwszy = new Filozof(widjeden,widdwa,1);
	    Filozof filozofDrugi = new Filozof(widdwa,widtrzy,2);
	    Filozof filozofTrzeci = new Filozof(widtrzy,widcztery,3);
	    Filozof filozofCzwarty = new Filozof(widcztery,widpiec,4);
	    Filozof filozofPiaty = new Filozof(widpiec,widjeden,5);

	    filozofPierwszy.start();
	    filozofDrugi.start();
	    filozofTrzeci.start();
	    filozofCzwarty.start();
	    filozofPiaty.start();

    }
}
