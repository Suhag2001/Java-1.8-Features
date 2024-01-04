package org.example.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API - Collection process
        //collection / group of objects
        //like Array

//        1 - blank stream
        Stream<Object> emptyStream = Stream.empty();
        // 2 - array, object , collection
          String names[]={ "suhag","aman","tanmay"};
          //we can create the stream of array in two ways
        Stream<String> stream1=  Stream.of(names);

        stream1.forEach(e->{
            System.out.println(e);
        });
        //3 - Arrays class of stream
        IntStream stream2= Arrays.stream(new int[]{1,2,3});
        stream2.forEach(i->{
//            System.out.println(i);
        });
// 4- builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();
      // 5 - list , set or any collection

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.forEach(i->{
//            System.out.println(i);
        });

        Stream<Integer> stream = list2.stream();
        stream.forEach(i->{
            System.out.println(i);
        });

    }
}
