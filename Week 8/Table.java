import java.util.*;

class TableSyn{
   void Multi(int n){
    try{
      System.out.println("Table of " + n + " is");
      for(int i = 1; i<=10;i++){
        System.out.println(n + "*" + i + "=" + n*i);
        Thread.sleep(500);
      }

    }
    catch(InterruptedException e){
      System.out.println("Child Interrupted");
    }
  }
}

class Multiplication extends Thread{
  int n;
  TableSyn target;
  String name;
  Thread t;
  Multiplication(String name,int num  , TableSyn targ){
    super(name);
    target = targ;
    n = num;
    this.name = name;

    System.out.println("ChildThread: "+ this);
    start();
  //  t = new Thread(this,name);
  }
  public void run(){

      synchronized(target){
        target.Multi(n);
        System.out.println("Exiting " + name);
}

  }
}

class Table{
  public static void main(String[] args) {
    TableSyn target = new TableSyn();
    new Multiplication("Five", 5,target);
    new Multiplication("Seven", 7,target);

    try{
      Thread.sleep(11000);
    }
    catch(InterruptedException e){
      System.out.println("Main Thread Interrupted");
    }
    System.out.println("Main Thread Exiting");
  }
}
