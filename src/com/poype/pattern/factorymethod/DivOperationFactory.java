package com.poype.pattern.factorymethod;


public class DivOperationFactory extends OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
