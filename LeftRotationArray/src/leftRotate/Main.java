package leftRotate;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */


    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int skok = 0;
        int skokPozaGranica = 0;

        List<Integer> tablica = new ArrayList<>(arr.size());


        for (int i = 0; i < arr.size(); i++) {
            skok = i + d;
            skokPozaGranica = skok - arr.size();
            if (skok > arr.size() - 1)
                tablica.add(arr.get(skokPozaGranica));
            else
                tablica.add(arr.get(skok));

        }
        return tablica;
    }
/// PONIŻSZA WERSJA DZIALA za wolno ****************

//        while (counter < d){
//            temp = arr.get(0);
//            for (int i =0; i < arr.size() ; i++){
//                if (i == arr.size() -1)
//                    arr.set(i, temp);
//                else
//                    arr.set(i, arr.get(i+1));
//            }
//            ++counter;
//        }
////        return arr;
//    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.rotateLeft(d, arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
