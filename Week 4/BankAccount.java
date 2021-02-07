import java.util.*;

class BankAccount{
  String name;
  int accNo;
  String accountType;
  double balance;
  static float roi ;

  BankAccount(){
    name = "";
    accNo = 0;
    accountType = "";
    balance = 0;
    roi = 0;
  }

  BankAccount(String n, int a, String at, double b, float r){
    name = n;
    accNo = a;
    accountType = at;
    balance  = b;
    roi = r;
  }

  void deposite(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount to be deposited ");
    double dep = sc.nextDouble();
    balance = balance + dep;
  }

  void withdraw(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount to be withdrawen ");
    double w = sc.nextDouble();
    int minimumBalance = 5000;
    if(balance < minimumBalance){
      System.out.println("You don't have enough balance - i.e minimumBalance is " + minimumBalance);
    }

    else if(balance-w < minimumBalance){
      System.out.println("You can't withdraw , minimumBalance is " + minimumBalance);
    }
    else{
        balance =balance - w;
    }
  }

  void display(){
    System.out.println("Name " + name   );
    System.out.println( "Account Number" + accNo);
    System.out.println("Account type" + accountType);
    System.out.println("Balance" + balance);
    System.out.println("Rate of Interest " + roi);
  }

  static void displayROI(){
    System.out.println("Rate of Interest " + roi);
  }
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    BankAccount b1 = new BankAccount();
    System.out.println("Default Constructor");
    b1.display();
    System.out.println("Enter your name ");
    String nm = sc.nextLine();
    System.out.println("Enter Account Number");
    int  acn = sc.nextInt();
    System.out.println("Enter Account Type");
    String act  =  sc.nextLine();
    act  = sc.nextLine();
    System.out.println("Enter Balance amount");
    double bl = sc.nextDouble();
    System.out.println("Enter Rate of Interest");
    float roI = sc.nextFloat();
    BankAccount b2 = new BankAccount(nm,acn,act,bl,roI);
    b2.display();
    b2.deposite();
    b2.display();
    b2.withdraw();
    b2.display();
    BankAccount.displayROI();
  }
}
