package com.poype.pattern.simplefactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if(numberB == 0) {
            throw new RuntimeException("除数不能为0.");
        }
        return numberA / numberB;
    }
}
