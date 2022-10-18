package Laboratorium3;

import java.util.Scanner;

public class Zad5 {
    public static void potegaTrojki () {
        int liczba;
        int wykladnik = 0;
        double potega=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbe nieujemną: ");
            liczba = sc.nextInt();
            sc.nextLine();
        } while (liczba < 0);

       sc.close();

        while (true){
           potega = Math.pow(3,wykladnik);

           if (potega < liczba){
               System.out.println("3^" + wykladnik + " = " + potega);
               wykladnik++;
           }
           else {
               break;
           }
       }

    }
}
