package com.poype.pattern.factorymethod;

public abstract class Operation {
    protected double numberA;
    protected double numberB;

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
