package streamapi;

import java.util.Arrays;
import java.util.List;



public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);
        myList.stream().forEach(n -> System.out.println(n));
        myList.stream().map(value -> value.doubleValue())
                .forEach(value -> System.out.println(value));
    }
}