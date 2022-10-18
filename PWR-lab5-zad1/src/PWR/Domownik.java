package PWR;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;



public class Domownik extends Thread{
    public static long ktoGada;

    private Semaphore s1;

    public Domownik(Semaphore s1)
    {
        this.s1 = s1;
    }

    void czytanie (){
        System.out.println("Nie przeszkadzaj czytam książkę " + getId());
    }
    void picieHerbaty (){
        System.out.println("Właśnie piję herbatę " + getId());
    }
    void rozmowaTelefoniczna () throws InterruptedException {
        System.out.println("watek: " + getId()+ " pyta czy gada ktos przez telefon?");
        if (ktoGada != -1)
            System.out.println( "Przez telefon rozmawia " + ktoGada);
        else{
            System.out.println("Telefon jest wolny");
            //System.out.println("S1 " + s1.availablePermits());
        }

        s1.tryAcquire();
        //System.out.println("Semafor opuszczony " + s1.availablePermits());
        ktoGada = getId();
        System.out.println("Rozmawiam przez telefon " + getId());
        int czasRozmowy = (int) (Math.random() * ((60 - 1)) + 1);
        TimeUnit.SECONDS.sleep(czasRozmowy);
        ktoGada = -1;
        s1.release();

    }

    void pracaPrzyKomputerze (){
        System.out.println("Pracuje na kompie "+ getId());
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            czytanie();
            picieHerbaty();
            pracaPrzyKomputerze();
            try {
                rozmowaTelefoniczna();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}