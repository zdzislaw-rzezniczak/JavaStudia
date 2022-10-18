package com.company;

public class DiagonalStar {

    public static void printSquareStar(int numberOfRows) {
        if (numberOfRows < 5)
            System.out.println("Invalid Value");
        else {
            for (int rowCount = 1; rowCount <= numberOfRows; ++rowCount) {
                for (int columnCount = 1; columnCount <= numberOfRows; ++columnCount) {
                    if (    rowCount == 1 ||
                            rowCount == numberOfRows ||
                            columnCount == 1 ||
                            columnCount == numberOfRows ||
                            columnCount == rowCount ||
                            columnCount == numberOfRows - rowCount + 1)

                        System.out.print("*");
                    else
                        System.out.print(" ");
                    if (columnCount == numberOfRows)
                        System.out.println();
                }

            }
        }
    }
}

