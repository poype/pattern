package com.poype.pattern.factorymethod;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
