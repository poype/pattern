package com.poype.pattern.strategy;

/*
 结账类
 */
public class SettleAccount {
    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    /**
     * 根据商品原价，返回应该收取的金额
     * @param originalMoney 商品原价格
     * @return 真正需要收取的钱
     */
    public double receiptMoney(double originalMoney) {
        double readMoney = discount.acceptCash(originalMoney);
        return readMoney;
    }

    public static void main(String[] args) {
        SettleAccount settleAccount = new SettleAccount();
        settleAccount.setDiscount(new DiscountReturn(300,100));
        double realMoney = settleAccount.receiptMoney(305);
        System.out.println(realMoney);
    }
}

/*
 策略模式提倡：
 1. 针对接口编程，而不是针对实现编程。例如此处的SettleAccount只依赖Discount类，而不依赖具体的打折类
 2. 多用组合，少用继承。
 3. 将程序中变化的部分和不变的部分隔离开。此处的打折方式有多种，是变化的，所以与收款类隔离开。

 策略模式定义：
 策略模式定义了算法族，各个具体算法的实现类可以相互替换，并且替换各个具体的算法不会影响到使用算法的客户。

 策略模式可能是我们平时使用最多的一种设计模式
 */
