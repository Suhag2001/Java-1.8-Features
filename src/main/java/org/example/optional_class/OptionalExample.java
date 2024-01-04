package org.example.optional_class;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {


    public static Optional<String> getName(){
        String name = "Suhag";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
//        String str = null ;
//        String str = "java is my favorite" ;
//        if(str == null) {
//            System.out.println("this is null object");
//        }else {
//            System.out.println(str.length());
//        }

        String str = "Java is my favorite";
//        String str = null;
        Optional<String> optional =Optional.ofNullable(str);
        System.out.println(optional.isPresent());
//        System.out.println(optional.get()); //if value doesn't exist then it will throw the NoSuchElementException

        System.out.println(optional.orElse("No value in this object"));

     Optional<String> nameOptional=  getName();
        System.out.println(nameOptional.orElse("Null value return"));
    


    }
}
