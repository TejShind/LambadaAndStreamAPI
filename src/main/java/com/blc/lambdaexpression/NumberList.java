package com.blc.lambdaexpression;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 6, 9, 44);


        Function<Integer, Double> doubleFunction = (n) -> n.doubleValue();
        myList.forEach(value -> System.out.println(" Integer Value to Double : " + doubleFunction.apply(value)));
    }

}