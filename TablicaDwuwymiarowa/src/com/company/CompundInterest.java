package com.company;

import java.util.Arrays;

public class CompundInterest {

    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //ustawienie stóp procentowych w przedziale 10-15%

        double[] interestRate = new double[NRATES];
        for (int j=0; j<interestRate.length; j++){
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        //Arrays.toString(interestRate);

        double[][] balances = new double[NYEARS][NRATES];

        // saldo poczatkowe 10000 balances[i][j] i=wiersz j = kolumna
        for (int j = 0; j< balances[0].length; j++ ){
            balances[0][j] = 10000;
        }

        //obliczanie odsetek dla przyszłych rat
        for (int i = 1; i< balances.length; i++){
            for (int j = 0; j<balances[i].length; j++){
                //pobranie sald z minionego roku z poprzedniego wiersza
                double oldBalance = balances[i-1][j];
                // obliczanie odsetek
                double interest = oldBalance * interestRate[j];
                //Obliczanie tegorocznego salda
                balances[i][j] = oldBalance + interest;
            }
        }

        //wydruk jednego wiersza stóp procentowych
        for (int j = 0; j< interestRate.length; j++){
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();

        // wydruk tabeli sald
        for (double[] row : balances)
        {
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
