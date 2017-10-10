package com.example.xuan.designmode.state;

/**
 * Author : xuan.
 * Date : 2017/10/10.
 * Description :input the description of this file.
 */

public class GumballMachine {
    State soldOutState, noQuarterState, hasQuarterState, soldState;
    State curState = soldOutState;
    int count = 0;

    public GumballMachine(int numBalls) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldState(this);
        if (numBalls > 0) {
            curState = noQuarterState;
            count = numBalls;
        }
    }

    public void insertQuarter() {
        curState.insertQuarter();
    }

    public void ejectQuarter() {
        curState.ejectQuarter();
    }

    public void turnCrank() {
        curState.turnCrank();
        curState.dispense();
    }

    public void setCurState(State curState) {
        this.curState = curState;
    }

    public boolean catchBall() {
        double a = Math.random();
        if (count > 0 && a % 2 == 0) {
            count--;
            return true;
        }
        return false;
    }

    public boolean hasBalls() {
        return count > 0;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
}
