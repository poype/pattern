package com.poype.pattern.factorymethod;

public class AddOperationFactory extends OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
