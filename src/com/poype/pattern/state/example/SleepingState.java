package com.poype.pattern.state.example;

public class SleepingState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("睡觉了");
    }
}
