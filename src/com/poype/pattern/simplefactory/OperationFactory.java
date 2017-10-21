package com.poype.pattern.simplefactory;

public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
/*
 利用面向对象中的继承和多态概念组织Operation*，每一种运算类型都对应一个类
 此时，如果要增加一种运算类型(比如sqrt操作)，只需要新增加一个类，而不需改动原来运行良好的代码

 使用类似Operation*这种方式组织的代码，会出现大量的类(一个操作就对应一个类)。这会给实例化类的对象带来麻烦(类太多了)。
 应该考虑用一个单独的类封装这个创造类实例的过程，这就是工厂。
 工厂方法将对象的实例化过程封装起来，用户代码只需要调用工厂方法就可以获得一个创建好的Operation实例。这方便了
 客户端代码的编写，也利于以后对代码的维护。
 */