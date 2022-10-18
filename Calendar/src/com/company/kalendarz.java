package com.company;

import java.time.DayOfWeek;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class kalendarz {

    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        int month = date.getMonthValue();
//        int today = date.getDayOfMonth();
//
//        date = date.minusDays (today - 1); // ustawienie na początek miesiąca
//        DayOfWeek weekday = date.getDayOfWeek();
//        int value = weekday.getValue(); // 1 poniedziałek 7=niedziela
//
//        System.out.println(" Pn  Wt  Śr  Czw  Pt  So  N");
//        for (int i = 1; i<value; i++)
//            System.out.print("    ");
//
//        while (date.getMonthValue() == month) {
//            System.out.printf("%3d", date.getDayOfMonth());
//            if (date.getDayOfMonth() == today)
//                System.out.print("*");
//            else
//                System.out.print(" ");
//            date = date.plusDays(1);
//            if (date.getDayOfWeek().getValue() == 1)
//                System.out.println();
//        }
//        if (date.getDayOfWeek().getValue() != 1)
//            System.out.println();

        Calendar c = Calendar.getInstance();
        // Setting to a different date
        c.set(Calendar.MONTH, 10);
        c.set(Calendar.YEAR, 1995);
        c.set(Calendar.DAY_OF_WEEK, 20);
        Date dt = c.getTime();
        c.setTime(dt);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
    }


}
