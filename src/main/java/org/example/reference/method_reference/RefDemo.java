package org.example.reference.method_reference;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning method rfereces..");
//
//        WonkInter wonkInter1= ()->{
//            System.out.println("this  is doing task new method ");
//        };
//        wonkInter1.doTask();


        //we refer the static method
        // ClassName::nethodName
        //need same parameter of the method
        WonkInter wonkInter = Stuff::doStuff;
        wonkInter.doTask();

          Runnable runnable = Stuff::threadTask;
          Thread d = new Thread(runnable);
          d.start();


          //Refering non static method
        // We need to create the object of the class - Object::methodName
          Stuff stuff  =new Stuff();
          Runnable runnable1 = stuff::PrintNumber;
          Thread thread = new Thread(runnable1);
          thread.start();




    }
}
