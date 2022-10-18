package Lab10;

import java.io.Console;

public class Password {

    public static String pobierzHaslo(){

        Console cnsl
                = System.console();

        if (cnsl == null) {
            return "Brak konsolii";
        }

        char[] ch = cnsl.readPassword(
                "Podaj haslo do konta: ");

        StringBuilder sbf
                = new StringBuilder();

        return sbf.append(ch).toString();


    }
}
