package Lab10;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 120;
            public void run() {
                System.out.println(i--);
                if (i< 0)
                    timer.cancel();
            }
        }, 0, 1000);
    }
}
