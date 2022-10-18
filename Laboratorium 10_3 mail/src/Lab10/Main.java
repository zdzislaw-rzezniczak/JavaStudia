package Lab10;


import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Poczta.wyslij("zdzichrz@gmail.com", Poczta.generujAdres(), Poczta.generujTemat(), Poczta.generujWiadomosc(), Poczta.pobierzHaslo());

    }
}