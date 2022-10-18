package Lab9;

import android.provider.Telephony;

import java.sql.*;

public class OdczytZbazy implements Runnable{

    static int id;

    static Connection conn;
    static Statement statement;



    public OdczytZbazy(int id) {
        this.id = id;
    }

     public void odczyt() {

             try {

                 conn = DriverManager.getConnection("jdbc:sqlite:E:\\Projekty JAVA intelij\\Laboratorium 9_2\\src\\Lab9\\filmy.db");
                 statement = conn.createStatement();
                 statement.execute("SELECT * FROM tablica");
                 ResultSet results = statement.getResultSet();
                synchronized (results) {


                    int i =0;
                    while (results.next() && i <20) {
                        System.out.println(results.getInt("pozycja") + " " +
                                results.getInt("id_filmu") + " " +
                                results.getInt("ocena") + " " +
                                results.getString("data_glosowania"));
                        ++i;
                    }

                }
                 results.close();
                 statement.close();
                 //conn.close();

             } catch (SQLException e) {
                 System.out.println("Wystąpił błąd bazy: " + e.getMessage());
             }

     }

public void run(){
        odczyt();
}

    public static void odczytWatki() {

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

