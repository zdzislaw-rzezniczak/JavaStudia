package Lab7;

import java.util.ArrayList;

public class Student {
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private static ArrayList <Student> listaStudentow = new ArrayList<>();

    public Student(String imie, String nazwisko, int numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        listaStudentow.add(this);
    }

    public Student(){
        this.imie = "Imię";
        this.nazwisko = "Nazwisko";
        this.numerIndeksu = 0;
        listaStudentow.add(this);
    }

    public static int getLiczbaStudentow() {
        return listaStudentow.size();
    }

    public static Student getStudent(int index){
        return listaStudentow.get(index-1);
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", Nr indeksu: " + numerIndeksu + " ";
    }

    public void ustawImie(String imie) {
        this.imie = imie;
    }

    public void ustawNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void ustawNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }
}
