package Laboratorium6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {

    public static final String delimiter = "[, ;]";
    public static ArrayList<Integer> macierz = new ArrayList<>();
    public static ArrayList<Integer> czytajCSV() {
        try {
            File plikCSV = new File("macierz.csv");
            FileReader fr = new FileReader(plikCSV);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tablica;
            while((line = br.readLine()) != null) {
                tablica = line.split(delimiter);

                for (int i=0; i < tablica.length; i++){
                    macierz.add(Integer.parseInt(tablica[i]));
                }
            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        return macierz;
    }


    public static void wyswietl (ArrayList<Integer> macierz){


        for (int i = 0; i < macierz.size(); i++){
            System.out.print(macierz.get(i) + " ");
            if (i != 0 && i % 9 == 0 )
                System.out.println();
        }
        System.out.println();

    }



}
