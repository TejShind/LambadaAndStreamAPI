package streamapi;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);
        List<Integer> sortedList = myList.stream()
                .sorted((n1, n2) -> -n1 + n2)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}