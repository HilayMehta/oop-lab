import java.util.*;

class Amstrong{
  void amstrong(int n){
    int num = n;
    int rem;
    int sum=0;
    while (n != 0){
      rem = n%10;
      sum = sum + rem*rem*rem;
      n = n/10;
    }
    if(sum == num){
      System.out.println("Amstrong Number");
    }
    else{
      System.out.println("Not a Amstrong Number");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Amstrong a = new Amstrong();
    System.out.println("Enter Number");
    int n = sc.nextInt();
      a.amstrong(n);

  }

}
