package Lab10;

public class Filozof extends Thread{

    private final Widelec widelecLewy;
    private final Widelec widelecPrawy;
    private final int id;

    public Filozof(Widelec widelecPrawy, Widelec widelecLewy,  int id) {
        this.widelecLewy = widelecLewy;
        this.widelecPrawy = widelecPrawy;
        this.id = id;
    }

    private void eat() throws InterruptedException {
        System.out.println("Filozof " + this.id + ": Jem obiad");
        Thread.sleep(30);
    }
    private void talk() throws InterruptedException {
        System.out.println("Filozof " + this.id + ": rozmawiam");
        Thread.sleep(30);
    }

    @Override
    public void run() {
        while(true){
            try {
                if (widelecLewy.getId() < widelecPrawy.getId() ){
                    widelecLewy.getS().acquire();
                    widelecPrawy.getS().acquire();
                }


                else{
                    widelecPrawy.getS().acquire();
                    widelecLewy.getS().acquire();
                }


                eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (widelecLewy.getId() > widelecPrawy.getId() ){
                widelecLewy.getS().release();
                widelecPrawy.getS().release();
            }else{
                widelecPrawy.getS().release();
                widelecLewy.getS().release();
            }
            try {
                talk();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
