package Lab10;

import java.util.concurrent.Semaphore;

public class Widelec {
    private final Semaphore s;
    private final int id;

    public Widelec(Semaphore s, int id) {
        this.s = s;
        this.id = id;
    }

    public Semaphore getS() {
        return s;
    }

    public int getId() {
        return id;
    }
}
