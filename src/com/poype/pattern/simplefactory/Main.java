package com.poype.pattern.simplefactory;

public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("/");
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
