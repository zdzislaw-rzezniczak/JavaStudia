package bitwiseAnd;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]); // liczba elementów zbioru

            int k = Integer.parseInt(nk[1]); // maks musi byc mniejszy niz k
            // A<B
            // A & B < k

            int maks = Integer.MIN_VALUE;

            for (int a = 1; a <= n; a++ ){
                for (int b=n; b>a; b--){
                    if ((a & b) > maks && (a & b) < k)
                        maks = a & b;
                }
            }
            System.out.println(maks);
        }

        scanner.close();

    }
}
