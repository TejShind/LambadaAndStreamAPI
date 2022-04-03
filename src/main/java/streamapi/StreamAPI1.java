package streamapi;

import java.util.Arrays;
import java.util.List;


public class StreamAPI1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);
        myList.stream().forEach(n -> System.out.println(n));//UC2.1

    }
}