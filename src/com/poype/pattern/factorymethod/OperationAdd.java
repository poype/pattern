package com.poype.pattern.factorymethod;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
