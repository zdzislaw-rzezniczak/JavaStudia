package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // liczba linii (list)


        for (int i = 0; i < n; i++){
            int numberOfElements = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
                for (int j = 0; j < numberOfElements; j++){
                    int liczba = sc.nextInt();
                    list.add(liczba);
                }
          lists.add(list);
        }

        int queries = sc.nextInt(); // liczba zapytań
        int numerLinii = 0;
        int numerRzedu = 0;

        for (int i = 0; i < queries; i++ ){
            numerLinii = sc.nextInt();
            numerRzedu = sc.nextInt();
            try{
                System.out.println(lists.get(numerLinii-1).get(numerRzedu-1));
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }

        }
    }
}
