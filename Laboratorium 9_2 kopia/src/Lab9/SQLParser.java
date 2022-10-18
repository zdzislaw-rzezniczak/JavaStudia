package Lab9;

public class SQLParser {

    public String createSaveQuery(Film film) {
        String query = "";

        query = "INSERT INTO tablica (id_filmu, id_uzytkownika, ocena, data_glosowania) VALUES ('" + film.getId_filmu() + "', '"
                + film.getId_uzytkownika() + "', '" + film.getOcena() + "', '" + film.getData_glosowania() + "')";

        return query;
    }
}