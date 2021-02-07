import  java.util.*;

class Time{
  int h;
  int m;
  int s;
  Time(){
    h=0;
    m=0;
    s=0;
  }
  Time(int hrs,int min,int sec){
    h= hrs;
    m = min;
    s = sec;
  }
  void Display(){
    System.out.println(h + ":" + m + ":"+ s);
  }
  Time add(Time t1, Time t2){
    Time t = new Time();
    t.h = t1.h + t2.h;
    t.m = t1.m + t2.m;
    if(t.m >60){
      t.h = t.h + 1;
      t.m = t.m %60;
    }
    t.s = t1.s +  t2.s;
    if(t.s >60){
      t.m = t.m + 1;
      t.s = t.s % 60;
    }

  return t;
}

Time Sub(Time t1, Time t2){
  Time t = new Time();
  t.h = Math.abs(t1.h- t2.h);
  t.m = Math.abs(t1.m - t2.m);
  t.s = Math.abs(t1.s - t2.s);
  return t;
}

int Compare(Time t1, Time t2){
  if(t1.h > t2.h){
    return 1;  // t1 is greater
  }
  else if(t1.h<t2.h){
    return -1;
  }
  else{
    if(t1.m >t2.m){
      return 1;
    }
    else if(t1.m < t2.m){
      return -1;
    }
    else{
      if(t1.s> t2.s){
        return 1;
      }
      else if(t1.s < t2.s){
        return -1;
      }
      else{
        return 0;
      }
    }
  }
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Time t1 = new Time(2,40,33);
  Time t2 = new Time(3,35,45);
  t1.Display();
  t2.Display();

  Time t3 = t1.add(t1,t2);
  t3.Display();
  Time t4 = t1.Sub(t1,t2);
  t4.Display();
  int x = t1.Compare(t1, t2);
  if(x == 1){
    System.out.println("Time 1 is greater");
  }
  else if(x ==-1){
    System.out.println("Time 1 is lesser");
  }
  else{
    System.out.println("Time is equal");
  }
}
}
