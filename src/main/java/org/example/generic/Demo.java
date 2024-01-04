package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("suhag");
//        list.add(38);


        List anotherList = new ArrayList<>();
        anotherList.add("suhag");
        anotherList.add(2999)   ;
        anotherList.add(true);
        anotherList.add(48484.4);

        System.out.println(list );
        System.out.println(anotherList);

    }
}
