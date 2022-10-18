package Lab10;

class Automat implements Pralka{
    int wysokoscObrotwWirowania;
    int czasPrania;
    int temperatura;

    public int getWysokoscObrotwWirowania() {
        return wysokoscObrotwWirowania;
    }

    public int getCzasPrania() {
        return czasPrania;
    }

    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public int setWysokoscObrotowWirowania(int wysokoscObrotowWirowania) {
        this.wysokoscObrotwWirowania = wysokoscObrotowWirowania;
        return 0;
    }

    @Override
    public int setCzasPrania(int czasPrania) {
        this.czasPrania = czasPrania;
        return 0;
    }

    @Override
    public int setTemeratura(int temeratura) {
        this.temperatura = temeratura;
        return 0;
    }


}

public class Main {

    public static void main(String[] args) {

        Automat Amica = new Automat();

        Amica.setCzasPrania(60);
        Amica.setTemeratura(40);
        Amica.setWysokoscObrotowWirowania(1200);
        System.out.println(Amica.getCzasPrania());
        System.out.println(Amica.getTemperatura());
        System.out.println(Amica.getWysokoscObrotwWirowania());
    }
}
