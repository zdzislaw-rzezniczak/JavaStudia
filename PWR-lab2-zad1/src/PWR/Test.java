package PWR;

public class Test {

    public static void main(String[] args) {
        Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();

        w1.setName("Watek 1");
        w2.setName("Watek 2");
        w3.setName("Watek 3");

        w1.start();
        w2.start();
        w3.start();
    }
}
