package org.example.reference.example;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8);
        System.out.println("list of integers : "+integers);

//        integers.stream().forEach(e -> System.out.println(e));

        integers.stream().forEach(System.out::println);
    }

}
