package org.example.generic;

public class Box<T> {

    //Object class is the parent class of all the classes in java
 public T  container;

  public  Box(T container) {
      this.container = container;
  }
  public T getContainer() {
      return this.container;
  }
    public void performTask(){
        if(container instanceof String ){
            System.out.println("length of "+container+" is : "+ ((String) container).length());
        }else if (container instanceof  Integer){
            System.out.println("this is integer value : "+((Integer) container));
        }
    }

}
