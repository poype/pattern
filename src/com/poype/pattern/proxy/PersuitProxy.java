package com.poype.pattern.proxy;


public class PersuitProxy implements GiveGift {
    private Persuit persuit;

    public PersuitProxy(Persuit persuit) {
        this.persuit = persuit;
    }

    @Override
    public void giveDolls() {
        System.out.println("代替追求者送洋娃娃");
        persuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        System.out.println("代替追求者送花");
        persuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        System.out.println("代替追求者送巧克力");
        persuit.giveChocolate();
    }
}
