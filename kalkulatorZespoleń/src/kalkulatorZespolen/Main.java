package kalkulatorZespolen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
		PrintWriter plik = new PrintWriter("filename.txt");
		double min = 0.261;
		double max = 3.0;
    	double polePowierzchni = 0.1;
    	double bokA;
    	double suma;
    	int liczbaProb = 12;
    	int counter;
    	String linia;

		for (int j = 0; j<40; j++){
			counter=0;
			bokA=0;
			suma=0;
			for (int i=0; i<liczbaProb; i++){
				bokA += 0.25;
				Zespolenie zespolenie = new Zespolenie(polePowierzchni,bokA);
				bokA = zespolenie.getBokA();
				double bokB = zespolenie.getBokB();
				if (bokB>max || bokB<min)
					continue;
				counter++;
				double cenaMetra = zespolenie.obliczCeneMetra();
				polePowierzchni = zespolenie.getPolePowierzchni();
				suma+= cenaMetra;

				//System.out.println("Pole powierzchni: " + polePowierzchni + " wymiary: " + bokA + "x" + bokB + " cena metra: " + cenaMetra);
			}
			if (counter>0){
				double sredniaCenaMetra = suma/ counter;
				linia = "Srednia cena 1m2 dla powierzchni: " + polePowierzchni + " wynosi: " +sredniaCenaMetra;
				plik.println(linia);
				System.out.println(linia);
			}
			polePowierzchni+= 0.1;			}
			plik.close();
    }
}
