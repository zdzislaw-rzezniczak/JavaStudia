package Lab9;

import java.sql.Date;
import java.time.LocalDate;

public class Film {


    private int id_filmu;
    private int id_uzytkownika;
    private int ocena;
    private Date data_glosowania;

    private final int min = 1;
    private final int max = 200;
    private final int maxOcena = 10;



    public Film() {
        id_filmu = min + (int)(Math.random() * ((max - min) + 1));
        id_uzytkownika = min + (int)(Math.random() * ((max - min) + 1));
        ocena =min + (int)(Math.random() * ((maxOcena - min) + 1));
        data_glosowania = Date.valueOf(LocalDate.now());
    }

    public Date getData_glosowania() {
        return data_glosowania;
    }

    public int getId_filmu() {
        return id_filmu;
    }

    public int getId_uzytkownika() {
        return id_uzytkownika;
    }

    public int getOcena() {
        return ocena;
    }

}