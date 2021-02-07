import java.util.*;

class Question3{
  int fact(int n){
    if(n==0 || n==1){
      return 1;
    }
    return n*fact(n-1);
  }

  int nCr(int n, int r){
    return (fact(n))/(fact(n-r)*fact(r)) ;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Question3 q = new Question3();
    System.out.println("Enter number for factioral ");
    int n = sc.nextInt();
    int factioral = q.fact(n);
    System.out.println("Factorial of " + n + "is "+ factioral );
    System.out.println("Enter n and r ");
    int num = sc.nextInt();
    int r  = sc.nextInt();
    double ncr = q.nCr(num,r);
    System.out.println("nCr is " + ncr );
  }

}
