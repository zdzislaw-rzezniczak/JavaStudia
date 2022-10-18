package choinka;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int wysokoscKorony= 0;
        int wysokoscPnia = 0;
        int szerokoscPnia = 0;

        System.out.println("Podaj wysokosc korony: ");
        Scanner sc = new Scanner(System.in);
        wysokoscKorony = sc.nextInt();
        System.out.println("Podaj wysokosć pnia: ");
        wysokoscPnia = sc.nextInt();
        System.out.println("Podaj szerokość pnia: ");
        szerokoscPnia = sc.nextInt();
        sc.close();

        for (int i = 1; i <= wysokoscKorony; ++i){
            for (int j = 1; j <=wysokoscKorony - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <(2 * i); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= wysokoscPnia; ++i){
            for (int j = 1; j <wysokoscKorony- szerokoscPnia +2; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= szerokoscPnia; ++j){
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
