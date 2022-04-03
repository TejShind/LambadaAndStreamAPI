package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;



public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);
        Function<Integer, Double> doubleFunction = n -> n.doubleValue();

        List<Double> doubleList = myList.stream()
                .map(doubleFunction)
                .collect(Collectors.toList());
        System.out.println(doubleList);
    }
}