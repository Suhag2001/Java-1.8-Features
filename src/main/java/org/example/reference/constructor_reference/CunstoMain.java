package org.example.reference.constructor_reference;

public class CunstoMain {
    public static void main(String[] args) {
        System.out.println("Learning constructor reference");

//        Provider provider = ()->{
//           return new Student();
//        };
//        provider.getStudent().display();


        // constructor reference
        // ClassName :: new
        Provider provider = Student::new;
        provider.getStudent().display();


    }
}
