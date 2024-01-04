package org.example.lamda_function;

public class Test {
    public static void main(String[] args) {
        System.out.println("My system starts .....");
//        MyInter myInter = new MyInterImpl();
//
//        myInter.sayHello();
// this is anonymous class
//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is first anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInter i2 =new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is my second anonymous class");
//            }
//        };
//
//        i2.sayHello();


        //using lambda rexpression
//        MyInter i = ()->{
//            System.out.println("this is my first time i am using lambda");
//        };
//        i.sayHello();
//
//        MyInter i2 = ()-> System.out.println("this is from first rule ");
//        i2.sayHello();

//        SumInter s  = (int a,int b) ->{
//            return a + b;
//        };

//        or
  //by using lambda second rule
//        SumInter s = (a , b) -> a + b;
//        System.out.println(s.sum(85 , 5));
//        System.out.println(s.sum(30,4));


        LengthInter l= str -> str.length();
        System.out.println(l.getLength("suhag mohinkar"));
    }
}
