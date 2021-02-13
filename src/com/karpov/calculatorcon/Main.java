package com.karpov.calculatorcon;

import com.karpov.calculatorcon.Calculator.SelectOperator;
import com.karpov.calculatorcon.Read.ReadConsole;
import com.karpov.calculatorcon.Read.Reader;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ReadConsole();
        SelectOperator selectOperator = new SelectOperator();
        selectOperator.getResult(reader.getLine());
    }
}
