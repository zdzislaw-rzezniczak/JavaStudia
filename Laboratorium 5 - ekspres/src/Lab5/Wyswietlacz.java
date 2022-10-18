package Lab5;

import java.util.ArrayList;

public class Wyswietlacz {

    public void wyswietlPrzepisy () {
        ModulPamieci modulPamieci = new ModulPamieci();
        ArrayList<String[]> przepisyNaKawe = modulPamieci.pobierzPrzepisy();
        String [] przepisNaKawe;
        System.out.println("Dostępne kawy:");
        for (String[] strings : przepisyNaKawe) {
            przepisNaKawe = strings;
            System.out.println(przepisNaKawe[0] + " " + przepisNaKawe[1]);
        }
    }

    public void wyswietlMenuGlowne () {
        System.out.println("Witam w menu ekspresu. Wybierz opcję. \n" +
                            "1. Kawa wg przepisu. \n" +
                            "2. Zapisz swoją kompozycję. \n" +
                            "3. Dowolna kawa.\n" +
                            "4. Przejdź do menu technicznego.\n" +
                            "5. Wyłącz ekspres. \n " );
    }

    public void wyswietlMenuTechniczne () {
        System.out.println("Menu techniczne \n" +
                            "1. Sprawdź poziom wody.\n" +
                            "2. Uzupełnij wodę.\n" +
                            "3. Sprawdź poziom mleka.\n" +
                            "4. Uzupełnij mleko. \n" +
                            "5. Sprawdź poziom cukru. \n" +
                            "6. Uzupełnij cukier.\n" +
                            "7. Opróżnij zbiornik na fusy.\n" +
                            "8. Wróć do menu głównego. \n");
    }
}
