package com.poype.pattern.factorymethod;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
