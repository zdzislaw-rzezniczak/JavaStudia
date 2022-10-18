package Lab5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ekspres {
    private final GrzalkaMleka grzalkaMleka;
    private final GrzalkaWody grzalkaWody;
    private final ModulPamieci modulPamieci;
    private final Wyswietlacz wyswietlacz;
    private final PompaWody pompaWody;
    private final PompaMleka pompaMleka;
    private final ZbiornikNaCukier zbiornikNaCukier;
    private final ZbiornikNaKawe zbiornikNaKawe;
    private final ZbiornikNaMleko zbiornikNaMleko;
    private final ZbiornikNaWode zbiornikNaWode;
    private final PanelPrzedni panelPrzedni;
    private final ZbiornikNaFusy zbiornikNaFusy;
    private final PojemnikNaKubki pojemnikNaKubki;
    private final Mlynek mlynek;
    private final Glowica glowica;
    private final String komunikatNieprawidlowegoWyboruMenu = "Nieprawidłowy wybor.. Wybierz ponownie..";
    private static final Scanner sc = new Scanner(System.in);

    public Ekspres(int pojemnoscZbiornikaNaCukier, int pojemnoscZbiornikaNaKawe, int pojemnoscZbiornikaNaMleko, int pojemnoscZbiornikaNaWode, int pojemnoscZbiornikaNaFusy, int maxliczbaKubkowWpojemniku) {
        this.grzalkaMleka = new GrzalkaMleka(60);
        this.grzalkaWody = new GrzalkaWody(100);
        this.modulPamieci = new ModulPamieci();
        this.wyswietlacz = new Wyswietlacz();
        this.pompaWody = new PompaWody();
        this.pompaMleka = new PompaMleka();
        this.zbiornikNaCukier = new ZbiornikNaCukier(pojemnoscZbiornikaNaCukier);
        this.zbiornikNaKawe = new ZbiornikNaKawe(pojemnoscZbiornikaNaKawe);
        this.zbiornikNaMleko = new ZbiornikNaMleko(pojemnoscZbiornikaNaMleko);
        this.zbiornikNaWode = new ZbiornikNaWode(pojemnoscZbiornikaNaWode);
        this.panelPrzedni = new PanelPrzedni();
        this.zbiornikNaFusy = new ZbiornikNaFusy(pojemnoscZbiornikaNaFusy);
        this.pojemnikNaKubki = new PojemnikNaKubki(maxliczbaKubkowWpojemniku);
        this.mlynek = new Mlynek();
        this.glowica = new Glowica();
    }


    public PanelPrzedni getPanelPrzedni() {
        return panelPrzedni;
    }

    //plikk csv format: numer{[0],nazwa[1],woda-porcja[2],kawa porcja =7g[3] porcja,mleko-porcj[4],cukier porcja 1 lyzeczka 7g[5]
//            1,Espresso,1,1
//            2,Americano,7,1
//            3,Flat White,1,1,2
//            4,Latte,2,2,1
//            5,Cappucino,1,1,1
//            6,Doppio,2,2

    public void zrobKaweWgPrzepisu (int numer) {
        ArrayList<String[]> przepisyNaKawe = modulPamieci.pobierzPrzepisy();
        String [] wybranyPrzepis;
        int liczbaPorcjiWody;
        int liczbaPorcjiKawy;
        int liczbaPorcjiMleka;
        int liczbaLyzeczekCukru;
        int liczbaGramowKawyNaPorcje = zbiornikNaKawe.getPorcja();

        wybranyPrzepis = przepisyNaKawe.get(numer - 1);
        liczbaPorcjiWody = Integer.parseInt(wybranyPrzepis[2]);
        liczbaPorcjiKawy = Integer.parseInt(wybranyPrzepis[3]);
        liczbaPorcjiMleka= Integer.parseInt(wybranyPrzepis[4]);
        liczbaLyzeczekCukru = Integer.parseInt(wybranyPrzepis[5]);

        if (liczbaLyzeczekCukru == 0){
            System.out.println("Wybrana kawa nie zawiera cukru ile łłyżeczek cukru dodać");
            liczbaLyzeczekCukru = sc.nextInt();
        }

        pobierzSkladniki(liczbaPorcjiWody, liczbaPorcjiKawy, liczbaPorcjiMleka,liczbaLyzeczekCukru,liczbaGramowKawyNaPorcje);
        przygotowywanieKawy();
        System.out.println("Kawa " + wybranyPrzepis[1] + " jest gotowa.");
        System.out.println("Mozesz wyjąć kubek.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }

    public void zrobDowolnaKawe () {

        System.out.println("Podaj ile wody w ml : ");
        int liczbaPorcjiWody = sc.nextInt()/30;
        sc.nextLine();


        System.out.println("Podaj moc kawy 1-4: ");
        int liczbaPorcjiKawy = sc.nextInt();
        sc.nextLine();

        System.out.println("Podaj ile mleka w ml (jesli czarna 0)");
        int liczbaPorcjiMleka = sc.nextInt()/30;
        sc.nextLine();

        System.out.println("Podaj ile łyżeczek cukru (bez cukru 0)");
        int liczbaLyzeczekCukru = sc.nextInt();
        sc.nextLine();

        int liczbaGramowKawyNaPorcje = zbiornikNaKawe.getPorcja();

        pobierzSkladniki(liczbaPorcjiWody, liczbaPorcjiKawy, liczbaPorcjiMleka,liczbaLyzeczekCukru,liczbaGramowKawyNaPorcje);
        przygotowywanieKawy();
        System.out.println("Twoja kawa jest gotowa.");
        System.out.println("Mozesz wyjąć kubek.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void pobierzSkladniki (int liczbaPorcjiWody, int liczbaPorcjiKawy, int liczbaPorcjiMleka, int liczbaLyzeczekCukru, int liczbaGramowKawyNaPorcje) {
        zbiornikNaFusy.dodajFusyPoKawie(liczbaPorcjiKawy, liczbaGramowKawyNaPorcje);
        zbiornikNaCukier.pobierzLiczbePorcji(liczbaLyzeczekCukru);
        zbiornikNaKawe.pobierzLiczbePorcji(liczbaPorcjiKawy);
        zbiornikNaMleko.pobierzLiczbePorcji(liczbaPorcjiMleka);
        zbiornikNaWode.pobierzLiczbePorcji(liczbaPorcjiWody);
        pojemnikNaKubki.pobierzLiczbePorcji(1);
    }

    public void przygotowywanieKawy () {
        mlynek.mielenieKawy();
        glowica.przesypywanieKawyDoGlowicy();
        grzalkaMleka.wlaczGrzalke();
        grzalkaWody.wlaczGrzalke();
        pompaWody.wlaczPompe();
        pompaMleka.wlaczPompe();

        grzalkaWody.wylaczGrzalke();
        grzalkaMleka.wylaczGrzalke();
        pompaMleka.wylaczPompe();
        pompaMleka.wylaczPompe();
    }

//    wyswietlMenuGlowne
//        System.out.println("Witam w w menu ekspresu. Wybierz opcję. /n" +
//                "1. Kawa wg przepisu. /n" +
//                "2. Zapisz swoją kompozycję. /n" +
//                "3. Dowolna kawa./n" +
//                "4. Przejdź do menu technicznego./n" +
//                "5. Wyłącz ekspres. /n " );


    public void obslugaMenuGlownego () throws IOException, InterruptedException {
        wyswietlacz.wyswietlMenuGlowne();
        int wybor = sc.nextInt();
        sc.nextLine();


    switch(wybor) {
        case 1 -> {
            wyswietlacz.wyswietlPrzepisy();
            System.out.println("Czy te kawy Ci odpowiadają. \nNaciśnij N by wrócić do menu głównego, \nnaciśnij T aby zrobić kawę wg przepisu");
            char czyRobimyKawe = Character.toUpperCase(sc.next().charAt(0));


            if (czyRobimyKawe == 'N') {
                obslugaMenuGlownego();
            } else {
                System.out.println("Podaj numer kawy");
                int wyborKawy = sc.nextInt();
                sc.nextLine();
                zrobKaweWgPrzepisu(wyborKawy);
            }

        }
        case 2-> modulPamieci.zapiszPrzepis();
        case 3 -> zrobDowolnaKawe();
        case 4 -> obslugaMenuTechnicznego();
        case 5 -> panelPrzedni.wylaczEkspres();
        default  -> {
            System.out.println(komunikatNieprawidlowegoWyboruMenu);
            obslugaMenuGlownego();
            }

    }
}
//"1. Sprawdź poziom wody.\n" +
//        "2. Uzupełnij wodę.\n" +
//        "3. Sprawdź poziom mleka.\n" +
//        "4. Uzupełnij mleko. \n" +
//        "5. Sprawdź poziom cukru. \n" +
//        "6. Uzupełnij cukier.\n" +
//        "7. Opróżnij zbiornik na fusy.\n" +
//        "8. Wróć do menu głównego. \n");

public void obslugaMenuTechnicznego() throws IOException, InterruptedException {

    wyswietlacz.wyswietlMenuTechniczne();
    int wybor2 = sc.nextInt();
    sc.nextLine();

    switch(wybor2) {
        case 1 -> System.out.println("Aktualny poziom wody wynosi " + zbiornikNaWode.getAktualnaZawarotscZbiornika() + " ml.");
        case 2 -> {
            zbiornikNaWode.uzupelnijZbiornik();
            obslugaMenuTechnicznego();
        }
        case 3-> System.out.println("Aktualnie pozostało " +zbiornikNaKawe.getAktualnaZawarotscZbiornika() + " gramów kawy.");
        case 4-> {
            zbiornikNaMleko.uzupelnijZbiornik();
            obslugaMenuTechnicznego();
        }
        case 5 -> System.out.println("Aktualnie pozostało " + zbiornikNaCukier.getAktualnaZawarotscZbiornika() + "gramów cukru");

        case 6 ->{
            zbiornikNaCukier.uzupelnijZbiornik();
            obslugaMenuTechnicznego();
        }
        case 7 -> {
            zbiornikNaFusy.oproznijZbiornikNaFusy();
            obslugaMenuTechnicznego();
        }
       case 8 -> obslugaMenuGlownego();
        default  -> {
            System.out.println(komunikatNieprawidlowegoWyboruMenu);
            obslugaMenuTechnicznego();
        }

    }

}

}
