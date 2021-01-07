package com.karpov.calculatorcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();
        String symbol = reader.readLine();
        String[] split = symbol.split("");
        if (split[1].equals("+")){
            calculator.setAction(new ActionAddition());
        }
        if (split[1].equals("-")) {
            calculator.setAction(new ActionSubtraction());
        }
        Double a = Double.valueOf(split[0]);
        Double b = Double.valueOf(split[2]);
        System.out.println(calculator.executeAction(a,b));

    }
}
