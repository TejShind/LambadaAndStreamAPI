package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);
        //For sum
        myList.stream().reduce(0, Integer::sum);
        Integer total = myList.stream().reduce(0, (v1, v2) -> v1 + v2);
        System.out.println(total);
        //For average
        Long length = myList.stream().count();
        System.out.println(total / length);
    }
}