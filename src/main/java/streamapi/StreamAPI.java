package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);

        Predicate<Integer> isEvenfunction = n -> n % 2 == 0;
        List<Integer> evenList = myList.stream()
                .filter(isEvenfunction)
                .collect(Collectors.toList());
        System.out.println(evenList);

    }
}