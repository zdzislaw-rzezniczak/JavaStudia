package Lab5;

public abstract class Pompa {
    private boolean czyWlaczona;

    public Pompa() {
        this.czyWlaczona = false;
    }

    public void wlaczPompe (){
        this.czyWlaczona=true;
    }

    public void wylaczPompe (){
        this.czyWlaczona = false;
    }
}

class PompaWody extends Pompa {
    public PompaWody() {
        super();
    }
}

class PompaMleka extends Pompa {
    public PompaMleka() {
        super();
    }
}
