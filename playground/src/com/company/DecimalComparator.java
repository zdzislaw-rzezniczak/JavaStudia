package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double no1, double no2){


        BigDecimal bd = new BigDecimal(Double.toString(no1));
        BigDecimal bd2 = new BigDecimal(Double.toString(no2));

        bd = bd.setScale(3, RoundingMode.DOWN);
        System.out.println(bd);

        bd2 = bd2.setScale(3, RoundingMode.DOWN);
        System.out.println(bd2);
        if (bd.equals(bd2))
            return true;
        else
            return false;

    }

}
