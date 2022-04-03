package com.blc.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 6, 9, 12, 25, 32, 44);

        // Using function interface convert Integer to Double

        Function<Integer, Double> doubleFunction = (n) -> n.doubleValue();
        myList.forEach(value -> System.out.println(" Integer Value to Double : " + doubleFunction.apply(value)));

        // Using predicate functional interface
        Predicate<Integer> isEvenFunction = (n) -> n % 2 == 0;
        myList.forEach(value -> System.out.println(value + " is even : " + isEvenFunction.test(value)));
    }

}