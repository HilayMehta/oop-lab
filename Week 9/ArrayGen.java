import java.util.*;

class Array<T>{


  void exchange(int f,int l,T a[]){
    T temp ;
    temp = a[f];
    a[f] = a[l];
    a[l] = temp;
  }

  void display(T a[]){
    for(int i = 0; i<a.length;i++){
      System.out.print(a[i] +" ");
    }
    System.out.println("");
  }
}


class ArrayGen{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of 1st array ");
    int  n1 = sc.nextInt();
    Integer[] a = new Integer[n1];
    for(int i  = 0;i<n1;i++){
      a[i] =  sc.nextInt();
    }

    Array<Integer> p = new Array<Integer>();
    p.display(a);
    p.exchange(1,3,a);
    p.display(a);


    System.out.println("Enter the length of 2nd array ");
    int  n2 = sc.nextInt();
    Double[] b = new Double[n2];
    for(int i= 0;i<n2;i++){
      b[i] =  sc.nextDouble();
    }
    Array<Double> q = new Array<Double>();
    q.display(b);
    q.exchange(1,3,b);
    q.display(b);


  }
}
