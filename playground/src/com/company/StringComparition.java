package com.company;

import java.util.Scanner;

public class StringComparition {


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int limit =k;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i=0; i <= s.length()-limit; ++i){
            String subS = s.substring(i, k);
            //  System.out.println(subS);
            ++k;
            if (i == 0){
                smallest = subS;
                largest = subS;
            }

            if (subS.compareTo(largest) >0)
                largest = subS;
            if (subS.compareTo(smallest) <0)
                smallest = subS;

        }
        return smallest + "\n" + largest;
    }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
}
