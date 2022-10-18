package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatExcercice {

    public static void currencyDisplay (){

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat cf1 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String us = cf1.format(payment);

        NumberFormat cf2 = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        String france = cf2.format(payment);

        NumberFormat cf3 = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String china = cf3.format(payment);

        NumberFormat cf4 = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = cf4.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
