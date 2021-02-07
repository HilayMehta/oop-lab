import java.util.*;

class Prime{
  int isPrime(int n){
    int prime = 1; // Prime
    for(int i = 2; i<n; i++){
      if(n%i == 0){
        prime = 0;
        break;  // not a prime
      }
    }
    return prime;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter n ");
    int n = sc.nextInt();
    Prime p = new Prime();
    int prime = p.isPrime(n);
    if(prime == 1){
      System.out.println("Prime Number");
    }
    else{
      System.out.println("Not a Prime Number");
    }
    int count = 0;
    int num = 2;
    while(count < n){
      int x = p.isPrime(num);
      if(x==1){
        System.out.println(num);
        count++;
      }
      num++;
    }
  }
}
