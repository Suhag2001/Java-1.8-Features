package org.example.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class MethodsInStream {

    public static void main(String[] args) {
        //filter(Predicate)
        //predicate means boolean value function
        //e -> { return e>=10;}


        //map(Function)
        /*
        each element operation
         */

        List<String> names = List.of("zebra","Aman","Ankit","Ankita","Anshul","Suhag");
        List<String> newList  = names.stream().filter(i-> i.startsWith("A")).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> numbers = List.of(9,8,3,4) ;
       List<Integer> newNumbers= numbers.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(newNumbers);

        names.stream().forEach(System.out::println);  //function refference

        names.stream().sorted().forEach(System.out::println); //function refference
        numbers.stream().sorted().forEach(System.out::println); //function refference


        //Comparator
     Integer min=   numbers.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println("min : " + min);
        Integer max= numbers.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println("max : " + max);

    }
}
