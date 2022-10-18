package PWR;


class Watek extends Thread{


    private static int[][] wynik;
    private static int[][] tablica1;
    private static int[][] tablica2;
    private static int SIZE;
    private final int reszta;


    public static int[][] getWynik() {
        return wynik;
    }

    public Watek(int[][] tablica1, int[][] tablica2, int  SIZE, int reszta, int [][] wynik) {
        Watek.tablica1 = tablica1;
        Watek.tablica2 = tablica2;
        Watek.SIZE = SIZE;
        this.reszta = reszta;
        Watek.wynik = wynik;
    }

    public static void mnozenieMacierz(int reszta) {
        for(int i = 0; i < SIZE; i++) {
            if (i % 4 == reszta){
                for (int j = 0; j < SIZE; j++) {
                    for (int k = 0; k < SIZE; k++) {

                        wynik[i][j] += tablica1[i][k] * tablica2[k][j];
                    }
                }
            }
        }
    }

    @Override
    public void run() {
        mnozenieMacierz(this.reszta);

    }
}
