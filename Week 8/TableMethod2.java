import java.util.*;

class TableSyn{
   synchronized void Multi(int n){

      System.out.println("Table of " + n + " is");
      for(int i = 1; i<=10;i++){
        System.out.println(n + "*" + i + "=" + n*i);
    //    Thread.sleep(500);



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


        target.Multi(n);
        //System.out.println("Exiting " + name);
}
}

class TableMethod2{
  public static void main(String[] args) {
    TableSyn target = new TableSyn();
    new Multiplication("Five", 5,target);

    new Multiplication("Seven", 7,target);

    try{
      Thread.sleep(100);
    }
    catch(InterruptedException e){
      System.out.println("Main Thread Interrupted");
    }
    System.out.println("Main Thread Exiting");
  }
}
