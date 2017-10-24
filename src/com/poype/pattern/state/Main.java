package com.poype.pattern.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}

/*
 ‘Long Method’是代码中的坏味道。有时候逻辑过于复杂，导致代码中有大量的if逻辑判断。为了消除庞大的条件判断语句，可以采用状态模式。
 状态模式通过把各种状态转移逻辑分布到State的各个子类中，来减少相互间的依赖，简化复杂的判断逻辑。
 当然，如果这个状态判断很简单，那就没必要用‘状态模式’了。
 */