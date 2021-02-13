package com.karpov.calculatorcon.Calculator;

import com.karpov.calculatorcon.Action.ActionAddition;
import com.karpov.calculatorcon.Action.ActionDivision;
import com.karpov.calculatorcon.Action.ActionMultiplication;
import com.karpov.calculatorcon.Action.ActionSubtraction;

public class SelectOperator {
    public void getResult(String line) {
        if (line != null && !line.equals("")) {
            Calculator calculator = new Calculator();
            String[] split = line.split(" ");
            if (split[1].equals("+")) {
                calculator.setAction(new ActionAddition());
            }
            if (split[1].equals("-")) {
                calculator.setAction(new ActionSubtraction());
            }
            if (split[1].equals("*")) {
                calculator.setAction(new ActionMultiplication());
            }
            if (split[1].equals("/")) {
                calculator.setAction(new ActionDivision());
            }
            Double a = Double.valueOf(split[0]);
            Double b = Double.valueOf(split[2]);
            System.out.println(calculator.executeAction(a, b));
        } else {
            throw new IllegalArgumentException("Illegal data");
        }
    }
}
