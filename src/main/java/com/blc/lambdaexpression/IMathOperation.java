package com.blc.lambdaexpression;

@FunctionalInterface

public interface IMathOperation {
    int calculate(int a, int b);

    static void printResult(int a, int b, String methodName, IMathOperation method) {
        System.out.println(" Result of " + methodName + " is " + method.calculate(a, b));
    }
}