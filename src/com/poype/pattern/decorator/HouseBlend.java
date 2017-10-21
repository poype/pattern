package com.poype.pattern.decorator;

/*
 具体饮料类
 */
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
