package Laboratorium6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Zad3 {
    public static void zapiszKalkulator(ArrayList<Integer> lista, char dzialanie, double wynik, double srednia) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("calc.txt"));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< lista.size(); i++) {
            sb.append("Składniki działania: ");
            sb.append(lista.get(i));
            sb.append(" " + "\n" );
        }
        if (dzialanie !='0'){
            sb.append ("Dzialanie : ");
            sb.append(dzialanie);
            sb.append("\n");
        }

        if (srednia !=0){
            sb.append("Srednia :");
            sb.append(srednia);
            sb.append("\n");
        }
        if (wynik !=0){
            sb.append("Wynik : ");
            sb.append(wynik);
            sb.append("\n");
        }


        br.write(sb.toString());
        br.close();
    }
}
