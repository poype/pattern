package com.poype.pattern.decorator;

/*
 具体饮料类
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
