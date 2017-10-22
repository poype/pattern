package com.poype.pattern.proxy;


public class Main {

    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("lily");
        GiveGift giveGift = new PersuitProxy(new Persuit(girl));
        giveGift.giveChocolate();
        giveGift.giveDolls();
        giveGift.giveFlowers();
    }
}

/*
 代理模式
 代理类可以在被代理类的基础上添加额外的工作，例如此处在PersuitProxy中增加了打印语句
 */