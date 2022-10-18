package Lab5;

public abstract class Grzalka {
    private int temperaturaGrzalki;
    private int maxTemperaturaGrzalki;

    public abstract boolean wlaczGrzalke();
    public abstract boolean wylaczGrzalke();

    public int getTemperaturaGrzalki() {
        return temperaturaGrzalki;
    }

    public Grzalka(int maxTemperaturaGrzalki) {
        this.temperaturaGrzalki = 0;
        this.maxTemperaturaGrzalki = maxTemperaturaGrzalki;
    }

    public void setTemperaturaGrzalki(int temperaturaGrzalki) {
        if (temperaturaGrzalki <= maxTemperaturaGrzalki && temperaturaGrzalki > 0)
            this.temperaturaGrzalki = temperaturaGrzalki;
        if (temperaturaGrzalki < 0 )
            this.temperaturaGrzalki = 0;
        if (temperaturaGrzalki > maxTemperaturaGrzalki);
            this.temperaturaGrzalki = maxTemperaturaGrzalki;
    }

    public int getMaxTemperaturaGrzalki() {
        return maxTemperaturaGrzalki;
    }

}

class GrzalkaMleka extends Grzalka {

    private boolean grzalkaMlekaWlaczona;

    public GrzalkaMleka(int maxTemperaturaGrzalki) {
        super(maxTemperaturaGrzalki);
        this.grzalkaMlekaWlaczona = false;
    }

    public boolean czyGrzalkaMlekaWlaczona() {
        return grzalkaMlekaWlaczona;
    }

    @Override
    public boolean wlaczGrzalke() {
        grzalkaMlekaWlaczona = true;
        return grzalkaMlekaWlaczona;
    }

    @Override
    public boolean wylaczGrzalke() {
        grzalkaMlekaWlaczona = false;
        return grzalkaMlekaWlaczona;
    }



}

class GrzalkaWody extends Grzalka{

    private boolean grzalkaWodyWlaczona;

    public GrzalkaWody(int maxTemperaturaGrzalki) {
        super(maxTemperaturaGrzalki);
        this.grzalkaWodyWlaczona = false;
    }

    public boolean czyGrzalkaWodyWlaczona() {
        return grzalkaWodyWlaczona;
    }

    @Override
    public boolean wlaczGrzalke() {
        grzalkaWodyWlaczona = true;
        return grzalkaWodyWlaczona;
    }

    @Override
    public boolean wylaczGrzalke() {
        grzalkaWodyWlaczona = false;
        return grzalkaWodyWlaczona;
    }
}
