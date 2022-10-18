package PWR;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();
        Watek w4 = new Watek();
        Watek w5 = new Watek();


//        w1.start();
//        w2.start();
//        w3.start();
//        w4.start();
//        w5.start();

        w5.start();
        w5.join();
        w4.start();
        w4.join();
        w3.start();
        w3.join();
        w2.start();
        w2.join();
        w1.start();
        w1.join();
    }
}
