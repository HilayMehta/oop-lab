import  java.util.*;

class LinearSearch{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        int i ;
        int[] a = new int[100];

        for(i = 0;i<n;i++){
          a[i] = sc.nextInt();
        }
        int found = 0; // not found
        System.out.println(" Enter the element to be searched ");
        int key = sc.nextInt();
        for(i=0;i<n;i++){
          if(key == a[i]){
            //System.out.println("Element found at position "+ (i+1));
            found = 1;
            break;
          }
        }
        if(found ==1){
          System.out.println("Element found");
        }
        else{
          System.out.println("Not Found ");
        }
  }
}
