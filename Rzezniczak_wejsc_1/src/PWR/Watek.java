//Zdzisław Rzeźniczak 103610 25.04.2021

package PWR;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Watek extends Thread{
        private Semaphore s1;
        private int a;
        private int b;

        public Watek(Semaphore s1) {
            this.s1 = s1;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj bok prostokata a: ");
            a = sc.nextInt();
            System.out.println("Podaj bok prostokata b: ");
            b = sc.nextInt();
            s1.release();
        }
}
