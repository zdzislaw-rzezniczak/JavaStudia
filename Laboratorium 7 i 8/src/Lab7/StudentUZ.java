package Lab7;

public class StudentUZ extends Student{

    private String wydzial;

    public void ustawWydział(String wydział) {
        this.wydzial = wydział;
    }

    public StudentUZ(){
        super();
        this.wydzial = "Wydział";
    }
    public StudentUZ(String wydzial) {
        super();
        this.wydzial = wydzial;
    }

    public StudentUZ(String imie, String nazwisko, int numerIndeksu, String wydział) {
        super(imie, nazwisko, numerIndeksu);
        this.wydzial = wydział;
    }

    @Override
    public String toString() {
        return super.toString() +" " + wydzial + " ";
    }
}
