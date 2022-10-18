package Laboratorium6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2 {

    public static void czytajPlikTxt() {

        try {
            File myObj = new File("plik.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                String dane = sc.nextLine();
                System.out.println(dane);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Niestety plik nie zostal znaleziony");
            e.printStackTrace();
        }
    }
}
