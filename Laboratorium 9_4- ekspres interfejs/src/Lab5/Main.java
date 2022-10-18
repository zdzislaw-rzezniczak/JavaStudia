package Lab5;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Ekspres bosch = new Ekspres(200, 210, 210, 420, 70, 50);

        bosch.getPanelPrzedni().wlaczEkspres();
        while (bosch.getPanelPrzedni().isOnOff()){


           bosch.obslugaMenuGlownego();

        }
    }
}