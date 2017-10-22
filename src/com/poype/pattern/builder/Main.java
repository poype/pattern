package com.poype.pattern.builder;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentBuilder().
                name("CC").
                password("qwerty").
                sex("男").
                address("银河系第二旋臂").
                build();
        System.out.println(student);
    }
}

/*
 使用构造函数构建对象和使用Builder模式构建对象优劣对比：
 使用构造函数：优点是比较简单，开发效率高，缺点是如果参数真的很多的话鬼知道每个参数对应的是什么意思啊。
 Builder模式：优点是可以将构建器的setter方法名取成类似注释的方式，这样我们可以很清晰的知道设置的什么值，可读性较高，缺点是比较冗长。
 Builder模式解决了要设置的参数过多不好管理的问题。
 */
