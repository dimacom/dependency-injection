package com.karpov.calculatorcon.Action;

public interface Action {
    /**
     * @param a operand one
     * @param b operand two
     *          <p>
     *          you can use operators :
     *          + Addition , return a + b
     *          - Subtraction , return a - b
     *          * Multiplication , return a * b
     *          / Division , return a / b IllegalArgumentException("division by zero is prohibited")
     *          <p>
     *          for example (input console 2 + 3(a + b) push enter return result 5 )
     */
    double execute(double a, double b);
}
