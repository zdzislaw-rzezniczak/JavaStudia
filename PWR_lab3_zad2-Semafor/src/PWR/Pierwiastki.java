package PWR;

import java.util.concurrent.Semaphore;

public class Pierwiastki extends Thread{
    private Semaphore s2;
    private Delta delta;
    private Dane dane;

    public Pierwiastki(Semaphore s2, Delta delta, Dane dane) {
        this.s2 = s2;
        this.delta = delta;
        this.dane = dane;
    }

    @Override
    public void run() {
        try {
            s2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double delt = delta.getDelta();
        double x1;
        double x2;
        int b = dane.getB();
        int a = dane.getA();
        if (delt < 0){
            System.out.println("brak rozwiazania delta ujemna");

        }
        if (delt > 0){
        x1 = -b - Math.sqrt(delt) / (2 * a);
        x2 = -b + Math.sqrt(delt) / (2 * a);
            System.out.println("Rozwiazaniem równania jest x1: " + x1 + " x2 " + x2);


        }
        if (delt == 0){

            x1 = -b / (double)(2 * a);
            System.out.println("Rozwiazaniem równania jest x: " + x1);

        }


    }

}
