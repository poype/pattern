package com.poype.pattern.decorator;


public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        // 加调料的饮料
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());
    }
}
/*
 装饰器模式动态地给一个对象添加一些额外的职责，
 当一个类在某种特定情况下需要一个功能，但在另外情况下不需要这个功能的时候，就比较适合使用装饰器模式。
 例如此处的例子，一杯饮料可以加各种各样的调料组合，也可以不加调料。
 使用装饰模式，装饰器的顺序有时也很重要，例如加密装饰器和压缩装饰器的顺序就不能乱。
 */
