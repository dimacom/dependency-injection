package com.karpov.calculatorcon.Calculator;

import com.karpov.calculatorcon.Action.Action;

public class Calculator {
    private Action action;
    public void setAction(Action action) {
        this.action = action;
    }
    public double executeAction(double a, double b) {
        return action.execute(a, b);
    }

}
