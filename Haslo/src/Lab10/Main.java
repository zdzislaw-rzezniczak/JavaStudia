package Lab10;


import java.io.*;
import java.util.Arrays;

public class Main {
        public static void main(String[] args)
        {
            // Create the console object
            Console cnsl
                    = System.console();

            if (cnsl == null) {
                System.out.println(
                        "No console available");
                return;
            }

            // Read line
            String str = cnsl.readLine(
                    "Enter username : ");

            // Print username
            System.out.println(
                    "Username : " + str);

            // Read password
            // into character array
            char[] ch = cnsl.readPassword(
                    "Enter password : ");

            System.out.println(Arrays.toString(ch));
            StringBuilder sbf
                    = new StringBuilder();

            String haslo = sbf.append(ch).toString();

            // Print password
            System.out.println(
                    "Password : " + haslo);
        }
    }

