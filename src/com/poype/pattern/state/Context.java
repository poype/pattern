package com.poype.pattern.state;

public class Context {

    private State state;

    //定义context的初始状态
    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state.Handle(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
