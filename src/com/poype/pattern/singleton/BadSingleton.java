package com.poype.pattern.singleton;

public class BadSingleton {
    private static BadSingleton uniqueInstance;

    private BadSingleton() {} //构造函数定位private，保证类不能在其它地方被实例化

    public static synchronized BadSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new BadSingleton();
        }
        return uniqueInstance;
    }
}

/*
 这里的getInstance采用同步方法，这严重损害了性能。
 而且只有第一次需要创建实例时，同步才是有用的，之后同步都是一种累赘。
 */
