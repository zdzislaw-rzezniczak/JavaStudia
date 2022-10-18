package Lab9;

import java.sql.*;

class GeneratorBazy implements Runnable {

    int id;

    public GeneratorBazy (int id){
        this.id = id;
    }

    public void run() {


            try {
                Connection conn;
                Statement statement;
                SQLParser parser = new SQLParser();

                conn = DriverManager.getConnection("jdbc:sqlite:E:\\Projekty JAVA intelij\\Laboratorium 9_2\\src\\Lab9\\filmy.db");
                statement = conn.createStatement();

                statement.execute("CREATE TABLE IF NOT EXISTS tablica (pozycja INTEGER PRIMARY KEY, id_filmu INTEGER, id_uzytkownika INTEGER, ocena INTEGER, data_glosowania DATE)");

                for (int i = 0; i < 200; i++) {
                    statement.execute(parser.createSaveQuery(new Film()));
                }

                statement.close();
                conn.close();
                System.out.println("Wątek " + id + " zakończył się. ");
            } catch (SQLException e) {
                System.out.println("Wystąpił błąd bazy: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Watek " + id + " wyrzucił wyjątek: " + e.getMessage());
                e.printStackTrace();
            }
    }

    public synchronized static void generuj() {

        Runnable[] runners = new Runnable[4];
        Thread[] threads = new Thread[4];

        for(int i=0; i<4; i++) {
            runners[i] = new GeneratorBazy(i);
        }

        for(int i=0; i<4; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for(int i=0; i<4; i++) {
                threads[i].start();
        }

    }
}