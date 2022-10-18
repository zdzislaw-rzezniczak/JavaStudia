package Lab5;

import java.util.Scanner;

public abstract class Zbiornik {
    protected int pojemnoscZbiornika;
    protected int aktualnaZawarotscZbiornika;
    protected int porcja;
    protected String komunikatUzupelnijZbiornikPozniej = "Mozesz uzupełnić zbiornik później z poziomu menu technicznego";
    protected String komunikatBrakuZawartosci = "Brak zawartości pojemnika";
    protected String komunikatCzyUzupelnic = "Czy uzupełnić zbiornik teraz? T/N";
    protected static Scanner sc = new Scanner (System.in);

    public Zbiornik(int pojemnoscZbiornika) {

        this.pojemnoscZbiornika = pojemnoscZbiornika;
        aktualnaZawarotscZbiornika = pojemnoscZbiornika;
    }

    public int getPojemnoscZbiornika() {
        return pojemnoscZbiornika;
    }

    public int getAktualnaZawarotscZbiornika() {
        return aktualnaZawarotscZbiornika;
    }

    public int getPorcja() {
        return porcja;
    }

    public void uzupelnijZbiornik () {
        aktualnaZawarotscZbiornika = pojemnoscZbiornika;
    }

    public void pobierzLiczbePorcji (int liczbaPorcji){
        int zawartoscPoZuzyciu = aktualnaZawarotscZbiornika - liczbaPorcji * porcja;
        if (zawartoscPoZuzyciu > 0){
            aktualnaZawarotscZbiornika = zawartoscPoZuzyciu;
        }
        else{

            System.out.println(komunikatBrakuZawartosci + komunikatCzyUzupelnic);

            char wybor = Character.toUpperCase(sc.next().charAt(0));

            if (wybor == 'T') {
                uzupelnijZbiornik();
                pobierzLiczbePorcji(liczbaPorcji);
            } else {
                System.out.println(komunikatUzupelnijZbiornikPozniej);
            }

        }

    }

}

class ZbiornikNaWode extends Zbiornik {

    public ZbiornikNaWode(int pojemnoscZbiornika) {
        super(pojemnoscZbiornika);
        this.porcja = 30;
        komunikatBrakuZawartosci = "Brak wystarczającej ilości wody. ";
    }
}

class ZbiornikNaMleko extends Zbiornik {

    public ZbiornikNaMleko(int pojemnoscZbiornika) {
        super(pojemnoscZbiornika);
        this.porcja = 30;
        komunikatBrakuZawartosci = "Brak wystarczającej ilości mleka. ";
    }

}

class ZbiornikNaCukier extends Zbiornik {

    public ZbiornikNaCukier(int pojemnoscZbiornika) {
        super(pojemnoscZbiornika);
        this.porcja = 5;
        komunikatBrakuZawartosci = "Brak wystarczającej ilości cukru. ";
    }

}

class ZbiornikNaKawe extends Zbiornik {

    public ZbiornikNaKawe(int pojemnoscZbiornika) {
        super(pojemnoscZbiornika);
        this.porcja = 7; //7g porcja kawy na espresso
        komunikatBrakuZawartosci = "Brak wystarczającej ilości kawy. ";
    }
}

class PojemnikNaKubki extends Zbiornik {

    public PojemnikNaKubki(int pojemnoscZbiornika) {
        super(pojemnoscZbiornika);
        this.porcja = 1; //
        komunikatBrakuZawartosci = "Niestety brak kubków.";
        komunikatCzyUzupelnic = "Czy uzupełnić kubki teraz? T/N";
    }

}

class ZbiornikNaFusy {
    private final int pojemnoscZbiornika;
    private int dostępnaMiejsceWZbiorniku;
    private static final Scanner sc = new Scanner(System.in);

    public ZbiornikNaFusy(int pojemnoscZbiornika) {
        this.pojemnoscZbiornika = pojemnoscZbiornika;
        this.dostępnaMiejsceWZbiorniku = pojemnoscZbiornika;
    }

    public void oproznijZbiornikNaFusy(){
        dostępnaMiejsceWZbiorniku = pojemnoscZbiornika;
    }

    public void dodajFusyPoKawie (int liczbaPorcji, int wielkoscPorcji) {
        dostępnaMiejsceWZbiorniku = dostępnaMiejsceWZbiorniku - (liczbaPorcji * wielkoscPorcji);

        if (dostępnaMiejsceWZbiorniku <= 0) {
            System.out.println("Brak miejsca w pojemniku na fusy. Czy opróżnić pojemnik na fusy?");
            char wybor = Character.toUpperCase(sc.next().charAt(0));

            if (wybor == 'T') {
                oproznijZbiornikNaFusy();
            } else {
                System.out.println("Mozesz uzupełnić zbiornik później z poziomu menu technicznego");
            }
        }
    }

    public int getPojemnoscZbiornika() {
        return pojemnoscZbiornika;
    }

    public int getDostępnaMiejsceWZbiorniku() {
        return dostępnaMiejsceWZbiorniku;
    }

    public void setDostępnaMiejsceWZbiorniku(int dostępnaMiejsceWZbiorniku) {
        this.dostępnaMiejsceWZbiorniku = dostępnaMiejsceWZbiorniku;
    }
}