package bitset;

import java.lang.invoke.SwitchPoint;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int M = sc.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        BitSet wybor;
        BitSet nieWybor;

        for (int i = 0; i < M; i++){
            String operation = sc.next();
            int choice = sc.nextInt();
                if (choice == 1){
                    wybor = B1;
                    nieWybor = B2;
                }
                else {
                    wybor = B2;
                    nieWybor = B1;
                }
            int bitNo = sc.nextInt();
            switch (operation){
                case "AND":
                    wybor.and(nieWybor);
                    break;
                case "OR":
                    wybor.or(nieWybor);
                    break;
                case "XOR":
                    wybor.xor(nieWybor);
                    break;
                case "FLIP":
                    wybor.flip(bitNo);
                    break;
                case "SET":
                    wybor.set(bitNo);
                    break;
            }
            System.out.print(B1.cardinality()+ " ");
            System.out.print(B2.cardinality());
            System.out.println();


        }
    }
}
