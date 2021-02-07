import java.util.*;
import java.util.Arrays;

class Mixer{
  public static int n ;
  int a[] = new int[100];

  void accept(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size ");
     n = sc.nextInt();
     int i;
     int x;
    System.out.println("Enter the Elements");
    for( i = 0; i<n;i++){
      int found = 0;
      x = sc.nextInt();
      for(i=0;i<n;i++){
        if(x == a[i]){
          //System.out.println("Element found at position "+ (i+1));
          found = 1;
          break;
        }
      }
      if(found == 0){
        a[i] = x;
      }

    }
    for(i=0;i<n-1;i++){
      for(int j=0; j<n-i-1;j++){
        if(a[j]>a[j+1]){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
    //Arrays.sort(a);

  }

  void Display(){
  //  System.out.printf("Modified arr[] : %s",
    //                      Arrays.toString(a));
    //System.out.print(a.length - n + " ");
    //int i = a.length -n;
  //  System.out.println(i);
    for(int i = 0 ; i<n;i++){
      System.out.print( a[i] + " ");
    //  arr[i] = sc.nextInt();
    }
    System.out.println(" ");
  }

  public static void main(String[] args) {
    Mixer m = new Mixer();
    m.accept();
    m.Display();
  }
}
