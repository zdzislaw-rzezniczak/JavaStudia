package com.company;

import java.util.Scanner;

public class Array {

    public static void arrayUtylity()

    {

        Scanner in = new Scanner(System.in);
        int numberOfTrials = in.nextInt();
        in.nextLine();
        String[] words = new String[numberOfTrials];
        for (int i = 0; i < numberOfTrials; i++) {
            words[i] = in.nextLine();

        }
        for (int i = 0; i < numberOfTrials; i++) {
            for (int j = 0; j <= words[i].length() - 1; ++j) {
                if (j % 2 == 0)
                    System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
            for (int j = 0; j <= words[i].length() - 1; ++j) {
                if (j % 2 == 1)
                    System.out.print(words[i].charAt(j));
            }
            System.out.println();

        }
    }

}
