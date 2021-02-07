import java.util.*;

class BubbleSort{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Size of array");
     int n = sc.nextInt();
     int i ;
     int[] a = new int[10];
     //int[] array = new int[10];
     for(i = 0;i<n;i++){
       a[i] = sc.nextInt();
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
     for(i = 0;i<n;i++){
       System.out.print(a[i]);
     }
     System.out.println(" ");
  }
}
