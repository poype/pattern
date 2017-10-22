package com.poype.pattern.factorymethod;


public class MulOperationFactory extends OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
