package com.blc.lambdaexpression;

public class MathOperation {

    public static void main(String[] args) {


        IMathOperation add = (a, b) -> a + b;
        IMathOperation sub = (a, b) -> a - b;
        IMathOperation mul = (a, b) -> a * b;
        IMathOperation div = (a, b) -> a / b;

        IMathOperation.printResult(6, 3, "addition", add);
        IMathOperation.printResult(9, 3, "subtraction", sub);
        IMathOperation.printResult(6, 3, "multiplication", mul);
        IMathOperation.printResult(11, 3, "division", div);

    }
}