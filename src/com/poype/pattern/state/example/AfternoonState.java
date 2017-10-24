package com.poype.pattern.state.example;

/*
 下午工作状态
 */
public class AfternoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 17) {
            System.out.println("现在是下午时间");
        } else {
            work.setCurrentState(new EveningState());
        }
    }
}
