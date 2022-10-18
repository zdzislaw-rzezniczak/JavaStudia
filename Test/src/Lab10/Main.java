package Lab10;

class Pracownik {
    String imie;
    String nazwisko;
    int pesel;

    public Pracownik(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}

class PracownikDepartament extends Pracownik {
    String nazwaDepartamentu;
    String dyrektorDepartamentu;
    int wysokoscWynagrodzenia;

    public PracownikDepartament(String imie, String nazwisko, int pesel, String nazwaDepartamentu, String dyrektorDepartamentu, int wysokoscWynagrodzenia) {
        super(imie, nazwisko, pesel);
        this.nazwaDepartamentu = nazwaDepartamentu;
        this.dyrektorDepartamentu = dyrektorDepartamentu;
        this.wysokoscWynagrodzenia = wysokoscWynagrodzenia;
    }

    public void setNazwaDepartamentu(String nazwaDepartamentu) {
        this.nazwaDepartamentu = nazwaDepartamentu;
    }

    public void setDyrektorDepartamentu(String dyrektorDepartamentu) {
        this.dyrektorDepartamentu = dyrektorDepartamentu;
    }

    public void setWysokoscWynagrodzenia(int wysokoscWynagrodzenia) {
        this.wysokoscWynagrodzenia = wysokoscWynagrodzenia;
    }

    public int getWysokoscWynagrodzenia() {
        return wysokoscWynagrodzenia;
    }
}

public class Main {

    public static void main(String[] args) {
        PracownikDepartament Andrzej = new PracownikDepartament("Andzrzej", "Kwiatkowski", 66775566,
                "Departament Obrony", "Jan Kowalski", 3300);

        Andrzej.setWysokoscWynagrodzenia(3500);
        System.out.println(Andrzej.getWysokoscWynagrodzenia());

    }
}
