package com.blc.lambdaexpression;

public class MathOperation {

    public static void main(String[] args) {


        IMathOperation add = (a, b) -> a + b;
        IMathOperation sub = (a, b) -> a - b;
        IMathOperation mul = (a, b) -> a * b;
        IMathOperation div = (a, b) -> a / b;

        System.out.println(add.calculate(10, 3));
        System.out.println(sub.calculate(9, 3));
        System.out.println(mul.calculate(6, 3));
        System.out.println(div.calculate(25, 6));

    }
}