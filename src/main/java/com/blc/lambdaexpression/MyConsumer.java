package com.blc.lambdaexpression;

import java.util.function.Consumer;

public class MyConsumer implements Consumer {
    @Override
    public void accept(Object value) {
        System.out.println(((Integer)value)+2);

    }
}
