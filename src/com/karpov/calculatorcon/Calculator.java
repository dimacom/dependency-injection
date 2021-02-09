package com.karpov.calculatorcon;

public class Calculator {
    private Action action ;//= new ActionZero();

    public void setAction(Action action) {
        this.action = action;
    }

    public double executeAction(double a, double b) {
        return action.execute(a, b);
    }
}
