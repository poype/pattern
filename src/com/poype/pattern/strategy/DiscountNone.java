package com.poype.pattern.strategy;

/*
 无任何折扣
 */
public class DiscountNone extends Discount {
    @Override
    public double acceptCash(double money) {
        return 0;
    }
}
