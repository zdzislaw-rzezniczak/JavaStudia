package Lab9;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        GeneratorBazy.generuj();
        TimeUnit.SECONDS.sleep(15);
        OdczytZbazy.odczyt();

    }

}
