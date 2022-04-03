package streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);

        Integer first = myList.stream()
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n))
                .findFirst()
                .orElse(null);
        System.out.println("First even number " + first);


    }
}