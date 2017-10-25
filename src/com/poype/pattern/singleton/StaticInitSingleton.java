package com.poype.pattern.singleton;

public class StaticInitSingleton {
    private static StaticInitSingleton uniqueInstance = new StaticInitSingleton();

    private StaticInitSingleton() {}

    public static StaticInitSingleton getInstance() {
        return uniqueInstance;
    }
}

/*
 在JVM加载这个类时马上创建此唯一的单例实例。JVM会保证在任何线程访问uniqueInstance静态变量之前，
 一定会创建好这个实例。
 */
