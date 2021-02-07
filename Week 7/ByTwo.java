import java.util.*;

interface series{
  int getNext();
  void reset();
  void setStart(int s);
}

class ByTwo implements series{
  int start ;
  int val;

  ByTwo(){
    start = 0;
    val = 0;
  }

  public void setStart(int s){
    start = s;
    val = s;
  }

  public void reset(){
    val = start;
  }

  public int getNext(){
    val = val + 2;
    return val;
  }
  public static void main(String[] args) {
    ByTwo ob = new ByTwo();

    System.out.println("Series: ");
    System.out.println("Starting at: "+ ob.val);
    for(int i = 0; i<5; i++)
    {
        System.out.println("Next value: "+ ob.getNext());
    }

      System.out.println("Series: ");
    ob.setStart(100);
    System.out.println("Starting at: "+ ob.val);
    for(int i = 0; i<5; i++){
      System.out.println("Next value: "+ ob.getNext());
    }

  }



}
