import java.util.*;
class Largest{

  public int largest(int a,int b,int c){
    if(a>b && a>c){
      return a;
    }
    else if(b>a && b>c){
      return b;
    }
    else{
      return c;
    }
  }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Largest l = new Largest();
    int res = l.largest(a,b,c);
    System.out.println("Largest is "+ res);
  }
}
