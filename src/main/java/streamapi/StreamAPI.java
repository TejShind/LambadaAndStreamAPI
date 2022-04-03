package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);
        Integer value = myList.stream()
                .min(Comparator.comparing(n -> n.intValue()))
                .orElse(null);
        System.out.println("Minimum Even number" + value);
        Integer value2 = myList.stream()
                .max((n1, n2) -> n1 - n2)
                .orElse(null);
        System.out.println("Maximum even number" + value2);
    }
}