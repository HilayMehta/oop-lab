import java.util.*;


class InsertDelete{
  public static int n;
    void insert(int a[] ){
      Scanner sc = new Scanner(System.in);
      int i;
      System.out.println("Enter the Position where you wanna insert");
      int pos = sc.nextInt();
      System.out.println("Enter the value ");
      int val = sc.nextInt();
      for( i = n; i>pos-1;i--){
        a[i] = a[i-1];
      }
      a[i] = val;
      n++;
      System.out.println("Array after insertion");
      for( i = 0;i<n;i++){
        System.out.print(a[i]) ;
      }
    }
    void delete(int a[]){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the Position where you wanna delete");
        int pos = sc.nextInt();
        for(i = pos;i<n;i++){
          a[i-1] = a[i];
        }
        n--;
        System.out.println("Array after deletion");
        for( i = 0;i<n;i++){
          System.out.print(a[i]) ;
        }
    }
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    InsertDelete ob = new InsertDelete();
    System.out.println("Enter the Size of array");
     n = sc.nextInt();
    int i ;
    int[] a = new int[100];
    //int[] array = new int[10];
    for(i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    ob.insert(a);
    ob.delete(a);
    //System.out.println(n);

    //n++;
  }
}
