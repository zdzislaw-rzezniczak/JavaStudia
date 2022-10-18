package Lab1;

import java.util.Scanner;

public class LiczbaPierwsza {

    public static boolean czyPierwsza (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = sc.nextInt();
        sc.close();
        if (liczba <= 0 )
            return false;
        else if (liczba % 2 ==0)
            return false;
        else
            return true;
    }

    public static void minMaxTablica(int [][] tab){
        int minTablicy = Integer.MAX_VALUE;
        int maxTablicy = Integer.MIN_VALUE;
        for (int[] ints : tab) {
            for (int anInt : ints) {
                if (anInt < minTablicy)
                    minTablicy = anInt;
                if (anInt > maxTablicy)
                    maxTablicy = anInt;
            }
        }
        System.out.println("Minimum tablicy: " + minTablicy +" maksimum tablicy: " + maxTablicy);

    }
}
