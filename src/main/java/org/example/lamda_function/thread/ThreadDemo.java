package org.example.lamda_function.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        //First Thread : Thead -JOHN

        Runnable thread1 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("value of i is : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("suhag");
        t.start();

        Runnable thread2 = () -> {
                  for(int i = 1; i <=10 ; i++) {
                      System.out.println(i*2);
                      try {
                          Thread.sleep(1000);
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                  }
        };

        Thread t2=  new Thread(thread2);
        t2.start();

    }
}
