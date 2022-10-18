package Lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ModulPamieci {

    //plikk csv format: numer,nazwa,woda-porcja,kawa porcja =7g porcja,mleko-porcj,cukier porcja 1 lyzeczka 7g
//            1,Espresso,1,1
//            2,Americano,7,1
//            3,Flat White,1,1,2
//            4,Latte,2,2,1
//            5,Cappucino,1,1,1
//            6,Doppio,2,2

    private ArrayList<String []> przepisyNaKawe = new ArrayList();
    private static final Scanner sc = new Scanner(System.in);

    public ArrayList <String[]> pobierzPrzepisy () {
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/przepisy.csv"));
            while ((line = br.readLine()) != null) {
                String[] przepisKawa = line.split(splitBy);
                przepisyNaKawe.add(przepisKawa);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return przepisyNaKawe;
    }

    public  void zapiszPrzepis () throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("src/przepisy.csv",true));
        StringBuilder sb = new StringBuilder();
        boolean czyDodacPrzepis = true;
        int numerOstatniegoPrzepisu;
        String [] ostatniPrzepis;
        while (czyDodacPrzepis){

            //numer,nazwa,woda-porcja,kawa porcja =30ml porcja,mleko-porcj,cukier porcja 1 lyzeczka 7g

            ostatniPrzepis = pobierzPrzepisy().get(pobierzPrzepisy().size()-1);
            numerOstatniegoPrzepisu = Integer.parseInt(ostatniPrzepis[0]);
            sb.append("\n");
            sb.append(numerOstatniegoPrzepisu +1);
            sb.append(",");
            System.out.println("Podaj nazwę: ");
            sb.append(sc.next());
            sc.nextLine();
            sb.append(",");
            System.out.println("Podaj ile porcji wody w ml : ");
            sb.append(sc.nextInt()/30);
            sc.nextLine();
            sb.append(",");

            System.out.println("Podaj moc kawy 1-4: ");
            sb.append(sc.nextInt());
            sc.nextLine();
            sb.append(",");

            System.out.println("Podaj ile mleka w ml (jesli czarna 0)");
            sb.append(sc.nextInt()/30);
            sc.nextLine();
            sb.append(",");

            System.out.println("Podaj ile łyżeczek cukru (bez cukru 0)");
            sb.append(sc.nextInt());
            sc.nextLine();
            czyDodacPrzepis = false;
        }

        br.write(sb.toString());
        br.close();
    }
}


