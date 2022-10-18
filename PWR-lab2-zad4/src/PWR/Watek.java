package PWR;

import java.util.Random;

public class Watek extends Thread{
    Random randomTime = new Random();
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" Witam jestem watek " + this.getName());
        }
        try {
            sleep(randomTime.nextInt(50));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
