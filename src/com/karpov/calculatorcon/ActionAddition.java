package com.karpov.calculatorcon;

public class ActionAddition implements Action {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
