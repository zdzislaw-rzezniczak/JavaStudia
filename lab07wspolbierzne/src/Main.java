import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int[][] matrixa = new int[4][4];
        int[][] matrixb = new int[4][4];
        int[][] matrixc = new int[4][4];
        List<Watek> listaWatkow = new ArrayList<>();
        Matrix matrixA = new Matrix(matrixa);
        matrixA.createMatrix();
        matrixA.displayMatrix();
        System.out.println();
        Matrix matrixB = new Matrix(matrixb);
        matrixB.createMatrix();
        matrixB.displayMatrix();
        System.out.println();
        Matrix matrixC = new Matrix(matrixc);
        matrixC.createMatrix();

        System.out.println();
        for (int i = 0; i < 4; i++) {
            Watek watek = new Watek(matrixC.getMacierz(), matrixA.getMacierz(), matrixB.getMacierz(), i);
            watek.start();
            listaWatkow.add(watek);

        }
        for (var w : listaWatkow) {
            w.join();
        }


        matrixC.displayMatrix();


    }
}

