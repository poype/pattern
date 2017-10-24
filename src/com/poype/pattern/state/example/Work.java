package com.poype.pattern.state.example;

public class Work {
    private int hour;
    private State currentState;

    public Work(int hour, State currentState) {
        this.hour = hour;
        this.currentState = currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        doWork();
    }

    public int getHour() {
        return hour;
    }

    public void doWork() {
        currentState.writeProgram(this);
    }
}
