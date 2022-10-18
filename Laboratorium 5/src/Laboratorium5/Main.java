package Laboratorium5;

import java.time.DateTimeException;

class Main {

    public static void main(String[] args) {
	// write your code here

//        Samochod porsche = new Samochod("Porsche", "911", 4500, "benzyna", 2016,400000);
//        System.out.println(porsche.getCena());
//        porsche.setCena(420000);
//        System.out.println(porsche.getCena());
//        System.out.println("Data rejestracji: " + porsche.getDataPierwszejRejestracji());
//        porsche.czyGwarancja();

        AutoKomis naKwiatowej = new AutoKomis("Autokomis na Kwiatowej");
        naKwiatowej.dodajAuto();
        naKwiatowej.dodajAuto();
        naKwiatowej.dodajAuto();
        naKwiatowej.wyswietlAutowKomis();
        naKwiatowej.wyswietlAutowKomis();
        

    }
}
