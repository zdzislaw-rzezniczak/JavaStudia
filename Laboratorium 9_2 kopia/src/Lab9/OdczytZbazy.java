package Lab9;

import java.sql.*;
import java.time.LocalDate;

public class OdczytZbazy implements Runnable {

    int id;

    public OdczytZbazy (int id){
        this.id = id;
    }
    static Connection conn;
    public void run() {


            try {

                Statement statement;
                conn = DriverManager.getConnection("jdbc:sqlite:E:\\Projekty JAVA intelij\\Laboratorium 9_2\\src\\Lab9\\filmy.db");
                statement = conn.createStatement();


                statement.execute("SELECT * FROM tablica");

                ResultSet results = statement.getResultSet();
                while (results.next()){
                    System.out.println(results.getInt("pozycja") + " " +
                            results.getInt("id_filmu") + " " +
                            results.getInt("ocena") + " " +
                            results.getString("data_glosowania"));
                }


                results.close();
                statement.close();
                conn.close();
                System.out.println("Wątek odczytu " + id + " zakończył się. ");
            } catch (SQLException e) {
                System.out.println("Wystąpił błąd bazy: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Wątek " + id + " wyrzucił wyjątek: " + e.getMessage());
                e.printStackTrace();
            }
    }

    public synchronized static void odczyt() {

        Runnable[] runners = new Runnable[4];
        Thread[] threads = new Thread[4];

        for(int i=0; i<4; i++) {
            runners[i] = new OdczytZbazy(i);
        }

        for(int i=0; i<4; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for(int i=0; i<4; i++) {
            threads[i].start();
        }
    }
}
