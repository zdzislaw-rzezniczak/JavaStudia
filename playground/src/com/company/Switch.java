package com.company;

import java.util.Scanner;

public class Switch {

    public static void charSwitch (){
        char switchValue = userCharInput();

        switch (switchValue) {
            case 'A':
                chosenLetterComunicate(switchValue);
                break;
            case 'B':
                chosenLetterComunicate(switchValue);
                break;
            case 'C':
                chosenLetterComunicate(switchValue);
                break;
            case 'D':
                chosenLetterComunicate(switchValue);
                break;
            case 'E':
                chosenLetterComunicate(switchValue);
                break;
            default:
                System.out.println("Not found");;
                break;
        }
    }

    private static void chosenLetterComunicate(char switchValue){
        System.out.println("The letter chosen is " + switchValue);
    }

    private static char userCharInput (){
        Scanner in = new Scanner (System.in);
        System.out.print("Give your choice A-E: ");
        char letter = Character.toUpperCase(in.next().charAt(0));
        return letter;
    }


}
