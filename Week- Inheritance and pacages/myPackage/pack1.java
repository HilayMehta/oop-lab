package p1;

import java.util.*;

class Maximum{
  int max(int a,int b,int c){
    if(a>b && a>c){
      return a;
    }
   if(b>a && b>c){
    
      return b;
    }
    if(c>a&&c>b){
      return c;
    }
    return -1;
  }
  float max(float a, float b,float c){
    if(a>b && a>c){
      return a;
    }
   if(b>a && b>c){
     System.out.println("Hello Ji");
      return b;
    }
    if(c>a&&c>b){
      return c;
    }
    return -1;
  }



  int max(int a[]){
    int m = a[0];
    for(int i=1;i<a.length;i++){
      if(a[i]>m){
        m=a[i];
      }
    }
    return m;
  }

}

class pack1{
  public static void main(String[] args){
    Maximum ob = new Maximum();
    int res = ob.max(1,2,3);
    System.out.println("result is"+ res);
  }
}
