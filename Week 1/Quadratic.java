import java.util.*;
//import java.lang.Math;

class Quadratic{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter three number");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = b*b- 4*a*c;
     int x = 0;
     double root1, root2;
     if(d==0){
       x = 0;
     }
     if(d>0){
       x = 1;
     }
     if(d<0){
       x = 2;
     }
     switch(x){
       case 1:  root1 = (-b + Math.sqrt(d)) / (2*a);
                root2 = (-b - Math.sqrt(d))/ (2*a) ;
                System.out.println("Roots are real and distinct");
                System.out.println("Root 1 is " + root1 + "Root 2 is " + root2);
                break;
      case 0: root1 = (-b + Math.sqrt(d)) / (2*a);
                         System.out.println("Roots are real and same");
                         System.out.println("The root is " + root1);
                         break;
      case 2: System.out.println("The Roots are Imaginary");
              int temp = -d;
              System.out.println("Root 1 is " + (-b/2*a) + "+ " + "i" + Math.sqrt(temp)/2*a);
              System.out.println("Root 2 is " + (-b/2*a) + "- " + "i" + Math.sqrt(temp)/2*a);
              break;
      default:
        System.out.println(" default case");
        break;
     }

  }

}
