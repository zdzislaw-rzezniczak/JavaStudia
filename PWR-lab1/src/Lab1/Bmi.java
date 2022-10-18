package Lab1;

import java.util.Scanner;

public class Bmi {
    public static double obliczBmi (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoją wagę kilogramach");
        double masa = sc.nextDouble();
        System.out.println("Podaj swój wzrost w centymetrach");
        double wzrost = sc.nextDouble();
        sc.close();

        double bmi = masa / Math.pow(wzrost/100, 2 );
        return bmi;
    }
}
