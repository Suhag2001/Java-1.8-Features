package org.example.generic;

public class Test {
    public static void main(String[] args) {

        // by using Object class our class is not a type safe
//        Box box = new Box("suhag");
        Box box = new Box(58888);
        System.out.println( box.getContainer());

        // Now we are using generic object

        Box<String> box1 = new Box<>("suhag");
        Box<Integer> box3 = new Box(8956);

        System.out.println(box1.getContainer());
        System.out.println(box1.container.getClass().getName());

        System.out.println(box3.getContainer());
        System.out.println(box3.container.getClass().getName());


         box1.performTask();
         box3.performTask();
    }

}
