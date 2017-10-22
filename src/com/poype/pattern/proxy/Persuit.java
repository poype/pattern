package com.poype.pattern.proxy;

public class Persuit implements GiveGift {

    private SchoolGirl girl;

    public Persuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println("送"+girl.getName()+"洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送"+girl.getName()+"花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("送"+girl.getName()+"巧克力");
    }
}
