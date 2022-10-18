package com.company;

public class Calculator{
    private Floor floor;
    private Carpet carpet;
    public Calculator(Floor f,Carpet c){
        this.floor=f;
        this.carpet=c;
    }
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
