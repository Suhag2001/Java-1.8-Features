package org.example.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {

        //there are three ways to create a list
        //immutable list
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list3);

        //list1

        //without stream
        //boilar plate code
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //Using stream
//        Stream<Integer> stream = list1.stream();
//      List<Integer> newList=   stream.filter(i -> i%2 == 0).collect(Collectors.toList());
//even list
        List<Integer> newListEven = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newListEven);
        //odd list
        List<Integer> newList = list1.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
        System.out.println(newList);


        List<Integer> greatest = list1.stream().filter(i ->i>5).collect(Collectors.toList());
        System.out.println(greatest);
    }
}
