package com.company;


import java.util.*;


public class Array2D {
    public static void array2D (){
        int rowSize = 6;
        int colSize = 6;
        int[][] arr = new int[rowSize][colSize];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int startRow = 0;
        int startCol = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (startCol < 4) {
            for (int i = startRow; i <= startRow + 2; i++)
                for (int j = startCol; j <= startCol + 2; j++) {
                    if (i == startRow + 1 && j == startCol + 1)
                        sum += arr[i][startCol + 1];
                    else if (i == startRow + 1 && j == startCol)
                        continue;
                    else if (i == startRow + 1 && j == startCol+2)
                        continue;
                    else
                        sum += arr[i][j];


                }
            if (sum >= max)
                max = sum;
            sum = 0;
            ++startRow;
            if (startRow == 4) {
                startRow = 0;
                ++startCol;
            }
        }
        scanner.close();
        System.out.println(max);
    }
}
