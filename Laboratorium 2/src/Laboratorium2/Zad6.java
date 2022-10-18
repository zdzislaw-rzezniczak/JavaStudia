package Laboratorium2;

public class Zad6 {
    public static double kalkulatorMiesiecznegoZobowiazania(double kwotaKredytu, int liczbaRat){
        if (kwotaKredytu > 300000){
            System.out.println("Maksymalna kwota kredytu to 300'000 PLN");
            System.out.println("Symulacja raty kredytu dla kwoty maksymalnej");
            kwotaKredytu = 300000;
        }
        if (liczbaRat > 96){
            System.out.println("Maksymalna liczba rat to 96");
            System.out.println("Symulacja dla 96 rat");
            liczbaRat = 96;
        }
        double oprocentowanie;
        if (liczbaRat <=24)
            oprocentowanie = 0.02;
        else if (liczbaRat <=48)
            oprocentowanie = 0.03;
        else if (liczbaRat <=60)
            oprocentowanie = 0.04;
        else if (liczbaRat <=72)
            oprocentowanie = 0.05;
        else
            oprocentowanie = 0.06;

        double Q = 1 + (oprocentowanie / 12);

        double rataMiesieczna = (kwotaKredytu * Math.pow(Q,liczbaRat) * (Q-1) / (Math.pow(Q,liczbaRat)-1));

        //zaokraglenie do 2 miejsc po przecinku
        rataMiesieczna= ((int)(rataMiesieczna * 100)) / 100.00;

        return rataMiesieczna;

    }
}



//        Rata równa = S * q^n * (q-1)/(q^n-1)
//
//        gdzie:
//        S – kwota kredytu
//        n – liczba rat
//        q – współczynnik równy 1 + (r/m)
//        q^n – „q” do potęgi „n”
//        r – oprocentowanie kredytu
//        m – liczba rat w okresie, dla którego obowiązuje oprocentowanie „r”.