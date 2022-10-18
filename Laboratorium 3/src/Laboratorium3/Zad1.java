package Laboratorium3;

import java.util.Scanner;

public class Zad1 {

    public static void liczbaAnalizator (){

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj dowolną liczbę: ");
        int liczba = sc.nextInt();

        sc.close();
        int sumaParzystych = 0;
        int sumaNieparzystych = 0;
        int licznikParzystych = 0;
        int licznikNieparzystych = 0;


        int absNumber = Math.abs(liczba);

        for (int i = 1; i<absNumber; i =i*10) {
            int digit = (int)((absNumber/i) % 10);
            System.out.print(digit + " ");
            if (digit%2 ==0){
                sumaParzystych += digit;
                licznikParzystych++;

            }
            else {
                sumaNieparzystych += digit;
                licznikNieparzystych++;
            }
        }
        System.out.println();
        double sredniaParzystych = 0;
        double sredniaNieparzystych = 0;

        try {
            sredniaParzystych = sumaParzystych / licznikParzystych;

        }
        catch (Exception ArithmeticException){
            System.out.println("W zadanej liczbie brak cyfr parzystych, nie można dzielić przez zero");
        }

        try {
            sredniaNieparzystych = sumaNieparzystych / licznikNieparzystych;

        }
        catch (Exception ArithmeticException){
            System.out.println("W zadanej liczbie brak cyfr nieparzystych");
        }

        double stosunekSrednich = 0;
        try
        {
            stosunekSrednich = sredniaNieparzystych / sredniaParzystych;
           if (sredniaParzystych !=0)
                System.out.println("Stosunek średniej cyfr nieparzystych do parzystych wynosi: " + stosunekSrednich);
        }
        catch (Exception ArithmeticException){
            System.out.println("W liczbie brak cyfr parzystych");
        }




        if (isPrime(liczba))
            System.out.println("Liczba: " + liczba + " JEST liczba pierwsza.");
        else
            System.out.println("Liczba: " + liczba + " NIE JEST liczba pierwsza.");

    }


    public static boolean isPrime (int number){
        if (number == 1)
            return false;
        for (int i=2; i<number; i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }



}
