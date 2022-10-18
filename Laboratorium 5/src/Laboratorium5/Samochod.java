package Laboratorium5;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Samochod {
    protected String marka;
    protected String model;
    protected int pojemnosc;
    protected String silnik;
    protected int rokProdukcji;
    protected LocalDate dataPierwszejRejestracji;
    protected int cena;
    protected int rokRejestracji;
    protected int miesiacRejestracji;
    protected int dzienRejestracji;


    Scanner sc = new Scanner (System.in);

    public Samochod(){
        this.marka = "Marka";
        this.model = "Model";
        this.pojemnosc = 0;
        this.silnik = "Typ silnika";
        this.rokProdukcji = 9999;
        this.cena = 0;
        this.dataPierwszejRejestracji = LocalDate.of(9999, 1,1);
    }

    public Samochod(String marka, String model, int pojemnosc, String silnik, int rokProdukcji, int cena, int rokRejestracji, int miesiacRejestracji, int dzienRejestracji) {
        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
        this.silnik = silnik;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
        this.rokRejestracji = rokRejestracji;
        this.miesiacRejestracji = miesiacRejestracji;
        this.dzienRejestracji = dzienRejestracji;
        this.dataPierwszejRejestracji = LocalDate.of(rokRejestracji, miesiacRejestracji, dzienRejestracji);


    }
    public Samochod(String marka, String model, int pojemnosc, String silnik, int rokProdukcji, int cena) {
        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
        this.silnik = silnik;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;

        setDataPierwszejRejestracji();

    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public LocalDate getDataPierwszejRejestracji() {
        return dataPierwszejRejestracji;
    }

    public void carInfo (){

        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Pojenosc: " + pojemnosc);
        System.out.println("Silnik: " + silnik);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Data rejestrqacji: " + dataPierwszejRejestracji);
        System.out.println("Cena: " + cena);

    }

    public void setDataPierwszejRejestracji() throws DateTimeException {

        System.out.println("Podaj rok rejestracji: ");

        this.rokRejestracji = sc.nextInt();
        sc.nextLine();
        while (rokRejestracji < rokProdukcji){
            System.out.println("Rok produkcji: "+ rokProdukcji + " Rejestracja nie może być przed rokiem produkcji. Podaj poprawny rok rejestracji: ");
            rokRejestracji = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Podaj miesiac rejestracji (1-12): ");
        this.miesiacRejestracji=sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj dzień rejestracji: ");
        this.dzienRejestracji = sc.nextInt();
        sc.nextLine();



        try {
            this.dataPierwszejRejestracji = LocalDate.of(rokRejestracji, miesiacRejestracji, dzienRejestracji);
        } catch(DateTimeException e) {
            System.out.println("Data podana z błędnego zakresu, podaj poprawna date:");
            setDataPierwszejRejestracji();
        }

    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public boolean czyGwarancja () {
        LocalDate data = LocalDate.now();
        Period period = Period.between(dataPierwszejRejestracji, data);
        boolean jestGwarancja;
        System.out.println("Od rejestracji minęło " + period.getYears() + " lat " + period.getMonths() + " miesiecy " + period.getDays() + " dni");

        if (period.getYears() < 2){
            jestGwarancja = true;
            System.out.println("Pojazd jest objęty gwarancją");
        } else {
            System.out.println("Niestety gwarancja upłynęła");
            jestGwarancja = false;
        }
        return jestGwarancja;
    }
}
