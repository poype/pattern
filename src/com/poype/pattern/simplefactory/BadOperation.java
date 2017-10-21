package com.poype.pattern.simplefactory;


public class BadOperation {

    public static double GetResult(double numberA, double numberB, String operate) {
        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        double result = BadOperation.GetResult(1.0, 2.0, "+");
        System.out.println(result);
    }
}

/*
 BadOperation如果要新增加一种运算操作，就需要增加一个case条件。
 本来是增加一个功能，却要对原有运行良好的功能代码进行修改，这会增加bug的风险。
 */

