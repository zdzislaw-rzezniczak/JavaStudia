package Lab5;

public class PanelPrzedni {
    private boolean OnOff;

    enum DiodaWylacznika {CZERWONY, ZIELONY}

    private DiodaWylacznika LEDOnOFF;

    public PanelPrzedni() {
        OnOff = false;
    }

    public DiodaWylacznika getLEDOnOFF() {
        return LEDOnOFF;
    }

    public boolean isOnOff() {
        return OnOff;
    }

    public void wlaczEkspres(){
        OnOff = true;
        LEDOnOFF = DiodaWylacznika.CZERWONY;
    }

    public void wylaczEkspres (){
        OnOff = false;
        LEDOnOFF = DiodaWylacznika.ZIELONY;

    }


}
