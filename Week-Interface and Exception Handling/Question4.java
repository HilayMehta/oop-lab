import java.util.*;
interface Series{
  int GetNext();
  void reset();
  void setStart(int n);
}

class TwoSeries implements Series{
  int start;
  int val;

  TwoSeries(){
    start = 0;
    val = 0;
  }

  public int GetNext(){
    val = val + 2;
    return val;
  }
  public void reset(){
    val = start;
  }
  public void setStart(int n){
    start = n;
    val = n;
  }
}


class Question4{
  public static void main(String[] args) {
      TwoSeries ts = new TwoSeries();
      System.out.println("Starting Series at "+ ts.val);
      for (int i=0;i<5 ;i++ ) {
        System.out.println("Next value: "+ ts.GetNext());
      }
  }
}
