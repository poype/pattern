package com.poype.pattern.state.example;

/*
 中午工作状态
 */
public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 13) {
            System.out.println("现在是中午时间，该吃午饭了");
        } else {
            work.setCurrentState(new AfternoonState());
        }
    }
}
