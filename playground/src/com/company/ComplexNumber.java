package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary){
        this.real += real;
        this.imaginary +=imaginary;
    }

    public void add (ComplexNumber number) {
        //ComplexNumber number1 = new ComplexNumber(number.real, number.imaginary);
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void subtract (double real, double imaginary){
        this.real -= real;
        this.imaginary -=imaginary;
    }

    public void subtract (ComplexNumber number) {
        //ComplexNumber number1 = new ComplexNumber(number.real, number.imaginary);
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    }
}
