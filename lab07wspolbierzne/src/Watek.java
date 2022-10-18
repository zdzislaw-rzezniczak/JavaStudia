public class Watek extends Thread{

    private final int numer;
    private int [][] macierz ;
    private int [][] macierzA;
    private int [][] macierzB;

    public Watek(int[][] macierz, int[][] macierzA, int[][] macierzB, int numer) {
        this.macierz = macierz;
        this.macierzA = macierzA;
        this.macierzB = macierzB;
        this.numer = numer;
    }

    @Override
    public void run(){


        switch (numer) {
        case 0 -> {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                    macierz[i][j] = macierzA[i][j] * macierzB[i][j];
                }
            }
        }
            case 1 -> {
            for (int i = 1; i < 2; i++) {
                for(int j = 1; j < 2;j++){
                    macierz[i][j] = macierzA[i][j] * macierzB[i][j];
                }
            }
        }
            case 2 -> {
            for (int i = 2; i < 3; i++) {
                for(int j = 2; j < 3;j++){
                    macierz[i][j] = macierzA[i][j] * macierzB[i][j];
                }
            }
        }
            case 3 -> {
            for (int i = 3; i < 4; i++) {
                for(int j = 3; j < 4;j++){
                    macierz[i][j] = macierzA[i][j] * macierzB[i][j];
                }
            }
        }


        }


//        System.out.println();
//            for (int i = 0; i < 4; i++) {
//                for(int j = 0; j < 4;j++){
////                    System.out.println(macierzA[i][j]);
////                    System.out.println(macierzB[i][j]);
////                    System.out.println();
//                    macierz[i][j] = macierzA[i][j] * macierzB[i][j];
//                }
//            }

//
//        for (int i = 0; i < 4; i++) {
//            for(int j = 0; j < 4;j++){
//                if (j%4==0){
//                    System.out.println();
//                }
//                if (macierz[i][j]<10){
//                    System.out.print("[  "+macierz[i][j]+" ]");
//                } else{
//                System.out.print("[ "+macierz[i][j]+" ]");}
//            }
//        }

    }

}
