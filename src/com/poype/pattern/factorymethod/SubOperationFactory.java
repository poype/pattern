package com.poype.pattern.factorymethod;

public class SubOperationFactory extends OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
