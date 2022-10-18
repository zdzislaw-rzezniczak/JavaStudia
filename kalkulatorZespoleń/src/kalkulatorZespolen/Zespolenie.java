package kalkulatorZespolen;

public class Zespolenie {
    private final double cenaSan23 = 8.77;
    private final double cenaProfil16 = 0.1215;
    private final double cenaTasmaDwustronna = 0.0124;
    private final double cenaNaroznik16 = 0.0059;
    private final double cenaIsomelt = 3.9396;
    private final double cenaKarton1180 = 5.4391;
    private final double cenaPaleta = 2.6087;
    private double cenaMetra;
    private double polePowierzchni;
    private final double obwod;
    private double bokA;
    private final double bokB;

    public Zespolenie(double polePowierzchni, double bokA) {
        this.polePowierzchni = polePowierzchni;
        this.bokA = bokA;
        bokB = polePowierzchni/bokA;
        obwod = 2 * bokA + 2 * bokB;
    }

    public void setPolePowierzchni(double polePowierzchni) {
        this.polePowierzchni = polePowierzchni;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getPolePowierzchni() {
        return polePowierzchni;
    }

    public double getObwod() {
        return obwod;
    }

    public double getBokA() {
        return bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public double obliczCeneMetra(){
         double cenaZespolenia = 2 * (polePowierzchni) * cenaSan23 + (obwod) * cenaProfil16 + 2 * (obwod) * cenaTasmaDwustronna + 4 * cenaNaroznik16 + 0.0475 * obwod * cenaIsomelt + 0.015 * cenaKarton1180 + 0.015 * cenaPaleta;

        double cenaMetra = Math.round(cenaZespolenia / polePowierzchni * 100.0) / 100.0;
        return cenaMetra;
    }

}