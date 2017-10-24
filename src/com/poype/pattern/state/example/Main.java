package com.poype.pattern.state.example;

public class Main {
    public static void main(String[] args) {
        State currentState = new ForenoonState();
        Work work = new Work(22,currentState);
        work.doWork();
    }
}
