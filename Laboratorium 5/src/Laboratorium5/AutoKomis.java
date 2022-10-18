package Laboratorium5;

import java.util.ArrayList;
import java.util.Scanner;

class AutoKomis {
    protected String nazwa;
    protected ArrayList<Samochod> samochody;
    private int lp=0;

    public AutoKomis(String nazwa) {
        lp++;
        this.nazwa = nazwa;
        this.samochody = new ArrayList<Samochod>();
    }

    public void wyswietlAutowKomis(){
        int liczbaAut = samochody.size();
        System.out.println("W komisie mamy " + liczbaAut + " podaj numer auta, które chcesz obejrzeć");
        Scanner scan = new Scanner(System.in);
        int wybor = scan.nextInt() -1;
        while (wybor > liczbaAut -1); {
            System.out.println("Nieprawidłowa liczba mamy mniej aut. Podaj ponownie: ");
            wybor = scan.nextInt() -1;
        }
        samochody.get(wybor).carInfo();
    }
    public void dodajAuto(){
        if (samochody.size() > 10){
            System.out.println("Komis pełen... Weź się do roboty i coś sprzedaj....");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj markę : ");
            String marka = scan.nextLine();
            System.out.print("Podaj model : ");
            String model = scan.nextLine();
            System.out.print("Podaj pojemnosc (1300): ");
            int pojemnosc = scan.nextInt();
            scan.nextLine();
            System.out.print("Podaj typ silnika: ");
            String silnik = scan.nextLine();
            System.out.print("Podaj rokprodukcji: ");
            int rokProdukcji = scan.nextInt();
            scan.nextLine();
            System.out.print("Podaj cene: ");
            int cena = scan.nextInt();
            scan.nextLine();
            scan.close();
            samochody.add(new Samochod(marka, model, pojemnosc, silnik, rokProdukcji, cena));
        }

    }
}
