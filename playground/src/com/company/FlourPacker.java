package com.company;

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        int totalSum = 0;
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        for (int i=0; i<=bigCount; ++i ) {
            totalSum = 5 * i;
            if (totalSum == goal)
                return true;
            if (totalSum > goal) {
                totalSum -= 5;
                break;
            }
            }
        for (int i = 1; i<=smallCount; ++i){
            ++totalSum ;
            if (totalSum == goal)
                return true;
            }
        return false;
    }
}
