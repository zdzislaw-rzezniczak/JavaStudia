package Lab10;

public class Main {

    public static void main(String[] args) {
	int licznik =10;
            try {
                for (int mianownik = 10; mianownik <= 10; mianownik--) {
                    System.out.println("dzielac " + licznik + " przez " + mianownik);
                    System.out.println(" Otzymam " + licznik / mianownik);
                }
            }
                catch (ArithmeticException e){
                    System.out.println("nie dzie przez zer0");
                    e.printStackTrace();
                }
            finally {
                System.out.println("działam dalej ");
            }
        System.out.println("koniec na dziś");
    }
}
