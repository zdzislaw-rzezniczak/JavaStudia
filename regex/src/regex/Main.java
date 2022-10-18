package regex;

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
        ArrayList <String> listaImion = new ArrayList<>();

        String gmailString = "@gmail.com";

        Pattern p = Pattern.compile(gmailString);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);

            if (m.find()){
                listaImion.add(firstName);
            }

        }

        scanner.close();

        Collections.sort(listaImion);

        for (String element: listaImion) {
            System.out.println(element);
        }
    }
}
