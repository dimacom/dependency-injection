package com.karpov.calculatorcon.Action;

public class ActionMultiplication implements Action {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
