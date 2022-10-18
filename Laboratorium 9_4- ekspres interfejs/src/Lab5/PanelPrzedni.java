package Lab5;

import java.util.concurrent.TimeUnit;

public class PanelPrzedni implements Uruchomiony{
    private boolean OnOff;

    @Override
    public void run() {
            System.out.println("Zostałem uruchomiony... ładowanie systemu operacyjnego. Moze zając kilka sekund");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    enum DiodaWylacznika {CZERWONY, ZIELONY}

    private DiodaWylacznika LEDOnOFF;

    public PanelPrzedni() {
        OnOff = false;
    }

    public DiodaWylacznika getLEDOnOFF() {
        return LEDOnOFF;
    }

    @Override
    public boolean isOnOff() {
        return OnOff;
    }

    @Override
    public void wlaczEkspres(){
        OnOff = true;
        run();
        LEDOnOFF = DiodaWylacznika.CZERWONY;
    }

    @Override
    public void wylaczEkspres (){
        OnOff = false;
        LEDOnOFF = DiodaWylacznika.ZIELONY;

    }


}
