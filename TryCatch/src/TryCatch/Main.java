package TryCatch;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;

        try{
            x =  sc.nextInt();
            y = sc.nextInt();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            return;
        }
        sc.close();

        try{
            int div = x / y;
            System.out.println(div);
        } catch (java.lang.ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
