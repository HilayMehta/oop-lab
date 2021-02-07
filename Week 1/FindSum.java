import java.util.*;

class FindSum{
  int findsum(int n){
    int sum = 0;
    while(n!=0){
      int rem = n%10;
      sum = sum + rem;
      n= n/10;
    }
    return sum;
  }
  public  static void  main(String[] args){
    Scanner sc = new Scanner(System.in);
    FindSum f = new FindSum();
    System.out.println("Enter Number");
    int n = sc.nextInt();
    int s = f.findsum(n);
    System.out.println("Sum of digits is " + s );
  }
}
