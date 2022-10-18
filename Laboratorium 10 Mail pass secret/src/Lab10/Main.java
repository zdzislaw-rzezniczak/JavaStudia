package Lab10;


public class Main {

    public static void main(String[] args) {
        Poczta.wyslij("zdzichrz@gmail.com", Poczta.generujAdres(), Poczta.generujTemat(), Poczta.generujWiadomosc(), Password.pobierzHaslo());

    }
}
