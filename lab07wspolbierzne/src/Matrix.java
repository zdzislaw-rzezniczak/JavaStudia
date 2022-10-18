import java.util.Random;

public class Matrix{
    Random generator = new Random();
    final int size = 4;
    private int [][] macierz;

    public Matrix(int[][] macierz) {
        this.macierz = macierz;
    }

    public void createMatrix() {
        for (int i = 0; i < size; i++) {
                for(int j=0; j<size;j++){
                    macierz[i][j]= generator.nextInt(9);
                }
        }
    }
    public void displayMatrix(){
        for (int i = 0; i < size; i++) {
            for(int j=0; j <size;j++){
                if (j%size==0){
                    System.out.println();
                }
                System.out.print("["+macierz[i][j]+"]");

            }
        }
    }

    public int getSize() {
        return size;
    }

    public int[][] getMacierz() {
        return macierz;
    }

    public void setMacierz(int[][] macierz) {
        this.macierz = macierz;
    }
}
