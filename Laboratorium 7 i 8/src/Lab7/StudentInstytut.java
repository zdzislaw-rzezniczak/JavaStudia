package Lab7;

public class StudentInstytut extends StudentUZ{
    private String instytut;

    public void ustawInstytut(String instytut) {
        this.instytut = instytut;
    }

    public String getInstytut() {
        return instytut;
    }

    public StudentInstytut() {
        super();
        this.instytut = "instytut";
    }

    @Override
    public String toString() {
        return super.toString() + " " + instytut;
    }
}
