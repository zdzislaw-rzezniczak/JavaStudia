package com.company;

//import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        char [] aTab = a.toLowerCase().toCharArray();
        char [] bTab = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(aTab);
        java.util.Arrays.sort(bTab);
        String sortA = java.util.Arrays.toString(aTab);
        String sortB = java.util.Arrays.toString(bTab);

        System.out.println(sortA);
        System.out.println(sortB);

        if (sortA.equals(sortB)){

            System.out.println("True");
            return true;
        }


        else {
            System.out.println("False");
            return false;
        }

    }
}
