package com.company;

public class Skeleton extends Boss{
    public int numOfArrow;

    public int getNumOfArrow() {
        return numOfArrow;
    }

    public void setNumOfArrow(int numOfArrow) {
        this.numOfArrow = numOfArrow;
    }

    public String printInfo(){
        return super.printInfo() + "  NumberOfArrows: " + this.getNumOfArrow();
    }
}
