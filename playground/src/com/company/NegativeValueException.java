package com.company;

public class NegativeValueException extends Exception {
    public String getMessage (){
        return "n and p should be non-negative";
    }
}
