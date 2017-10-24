package com.poype.pattern.state.example;

/*
 上午工作状态
 */
public class ForenoonState implements State {

    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 12) {
            System.out.println("现在是上午时间，工作精神百倍");
        } else {
            work.setCurrentState(new NoonState());
        }
    }
}
