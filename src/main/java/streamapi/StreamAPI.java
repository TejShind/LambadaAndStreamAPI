package streamapi;

import java.util.Arrays;

import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 5, 8, 16, 2, 3, 4);
        System.out.println(myList.stream().allMatch(n -> n % 2 == 0));//return true or false
        System.out.println(myList.stream().noneMatch(n -> n % 2 == 0));
        System.out.println(myList.stream().anyMatch(n -> n % 2 == 0));
    }
}