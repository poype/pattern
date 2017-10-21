package com.poype.pattern.strategy;

/*
 按照百分比打折
 */
public class DiscountRate extends Discount{

    private double discountRate;

    public DiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double acceptCash(double money) {
        return money * discountRate;
    }
}
