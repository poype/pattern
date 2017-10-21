package com.poype.pattern.strategy;

/*
 满额减
 */
public class DiscountReturn extends Discount {

    private double moneyCondition;
    private double moneyReturn;

    public DiscountReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money > moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
