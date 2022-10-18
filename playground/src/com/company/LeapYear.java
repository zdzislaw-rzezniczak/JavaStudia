package com.company;

class LeapYear {
    public static boolean isLeapYear(int year){
        if (year >=1 && year <= 9999){
            if (year%4==0)
                if (year%100==0) {
                    if (year % 400 == 0)
                        return true;
                    else
                        return false;
                }
                else
                    return true;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if (year < 1 || year > 9999)
            return -1;
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (isLeapYear(year))
                        return 29;
                    else
                        return 28;
                default:
                    return -1;
            }
        }
    }
}
