package com.poype.pattern.singleton;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton uniqueInstance; //变量声明为volatile保证线程间可视性

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}

/*
 相比于BadSingleton，这种方式将大大提高性能
 */