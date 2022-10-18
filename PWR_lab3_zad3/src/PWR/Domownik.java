package PWR;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;



public class Domownik extends Thread{
    public static String ktoGada = "";

    private Semaphore s1;

    public Domownik(Semaphore s1) {
        this.s1 = s1;
    }

    void czytanie (){
        System.out.println("Nie przeszkadzaj czytam książkę " + getName());
    }
    void picieHerbaty (){
        System.out.println("Właśnie piję herbatę " + getName());
    }
    void rozmowaTelefoniczna () throws InterruptedException {
        System.out.println(getName()+ " pyta czy gada ktos przez telefon?");
        if (!ktoGada.isEmpty())
            System.out.println( "przez telefon rozmawia " + ktoGada);
        else{
            System.out.println("jest wolne");
            System.out.println("S1 " + s1.availablePermits());
        }

        s1.tryAcquire();
        System.out.println("Semafor opuszczony " + s1.availablePermits());
        ktoGada = getName();
        System.out.println("Rozmawiam przez telefon " + getName());
        int czasRozmowy = (int) (Math.random() * ((30 - 1)) + 1);
        TimeUnit.SECONDS.sleep(czasRozmowy);
        ktoGada = "";
        s1.release();

    }

    void pracaPrzyKomputerze (){
        System.out.println("Pracuje na kompie "+ getName());
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            if (s1.availablePermits() == 1){
                try {
                    rozmowaTelefoniczna();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                czytanie();
                picieHerbaty();
                pracaPrzyKomputerze();
            }


        }
    }
}
