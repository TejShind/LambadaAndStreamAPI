package com.blc.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 6, 9, 44);
        ///By using Iterator
//        Iterator<Integer> iterator = myList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        //By  using Consumer class
//        MyConsumer action = new MyConsumer();
//        myList.forEach(action);
        ////By using anonymous class
//            myList.forEach(new Consumer<Integer>() {
//                @Override
//                public void accept(Integer value) {
//                    System.out.println(value);
//                }
//            });

        //LAMBDA function
        myList.forEach(value -> {System.out.println(value);});
//        Consumer<Integer> implementation = value -> System.out.println(value);
//        myList.forEach(implementation);
    }

}