package com.karpov.calculatorcon;

public class ActionDivision implements Action {
    @Override
    public double execute(double a, double b) {
        if (b == 0){
            throw new IllegalArgumentException("division by zero is prohibited");
        }
            return a / b;
    }
}
