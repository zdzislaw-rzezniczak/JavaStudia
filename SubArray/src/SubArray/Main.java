package SubArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int liczbaElementowTablicy = sc.nextInt();
        int []tablica = new int[liczbaElementowTablicy];
        int licznikUjemnychPoddablic = 0;
        int sumaElementow = 0;

        for (int i = 0; i < liczbaElementowTablicy; i++){
            tablica[i] = sc.nextInt();
        }

        for (int i = 0; i<liczbaElementowTablicy; i++){
            for (int j = i; j < liczbaElementowTablicy; j++){
                sumaElementow += tablica[j];
                if (sumaElementow < 0)
                    licznikUjemnychPoddablic++;
            }
            sumaElementow = 0;
        }

        System.out.println(licznikUjemnychPoddablic);
    }
}
