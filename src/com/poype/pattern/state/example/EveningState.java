package com.poype.pattern.state.example;

/*
 晚间工作状态
 */
public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 21) {
            System.out.println("晚上加班很辛苦");
        } else {
            work.setCurrentState(new SleepingState());
        }
    }
}
