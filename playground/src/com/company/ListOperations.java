package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void addRemoveListsItems(){
        List<Integer> lista = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("ile elementów ma mieć lista? ");
        int ileElementow = in.nextInt();
        System.out.println("wypisz elementy oddzielone spacją: ");
        while (in.hasNextInt()){
            if (in.hasNextInt()){
                int element = in.nextInt();
//                System.out.print(element);
//                System.out.print(" ");
                lista.add(element);
                --ileElementow;
                if (ileElementow == 0) {
                    System.out.println();
                    break;
                }
            }
            else
                in.next();
        }

//        for (Integer e: lista) {
//             System.out.print(e);
//             System.out.print(" ");
//        }
        System.out.println("ile działań na liście chcesz przeprowadzić: ");
        in.nextLine();
        int ileOperacji = in.nextInt();
        String operacja ="";
        int x;
        int y;
        for (int i = 1; i<=ileOperacji; ++i){
            System.out.println("jaką operację chcesz przeprowadzoić? Insert czy Delete:");
            in.nextLine();
            operacja = in.next();
            //in.nextLine();
            if (operacja.toLowerCase().contains("insert")){
                System.out.println("W którym miejscu listy dodać ? Musi być <= " + lista.size() + ": ");
                in.nextLine();
                x = in.nextInt();
                System.out.println("Podaj liczbę która chcesz wstawić: ");
                in.nextLine();
                y = in.nextInt();
                lista.add(x, y);
            }
        }
        if (operacja.toLowerCase().contains("delete")){
            System.out.println("który element chcesz usunąć");
            x = in.nextInt();
            lista.remove(x);
        }

        for (Integer e: lista) {
            System.out.print(e);
            System.out.print(" ");
        }
    }
}
