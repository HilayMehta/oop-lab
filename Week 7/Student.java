import java.util.*;

class SeatFilledException extends Exception{

}


class Student{
  int regNo;
  String name;
  String doj;
  short semester;
  float gpa;
  float cgpa;
  static int count = 1;


  void display(){
    System.out.println("Registration Number is " + regNo);
    System.out.println("Name is " + name);
    System.out.println("Date of Joining " + doj);
    System.out.println("semester " + semester);
    System.out.println("GPA is " + gpa);
    System.out.println("CGPA is" + cgpa);
  }
  Student(int r, String n, String d, short s, float g,float c){
    regNo = r;
    name = n;
    doj = d;
    semester = s;
    gpa = g;
    cgpa = c;
    count++ ;
  }

  public void validReg() throws SeatFilledException{
    if(count >3){
      throw new SeatFilledException();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     Student[] arr;
     arr = new Student[100];
     System.out.println("Enter number");
     int n = sc.nextInt();
    // String[] nm = new String[5];
     //String[] dj =  new String[5];
     for(int i = 0; i<n;i++){
       System.out.println("Enter your name " );
       String nm = sc.nextLine();
       nm = sc.nextLine();  //// Juggad method
      System.out.println("Enter your date of Joining acc to greg calender");
       String dj = sc.nextLine();
       String year = dj.substring(dj.length() -2, dj.length());
       int  y = Integer.parseInt(year);
       int reg = y*100 + Student.count;
       //String temp = Integer.toString(++Student.count );
       //String reg = year.concat(temp);
       //int regno = Integer.parseInt(reg);

       System.out.println(reg);
       System.out.println("Enter your semester");
       short sm = sc.nextShort();
       System.out.println("Enter your gpa");
       float gp = sc.nextFloat();
       System.out.println("Enter your cgpa");
       float cgp = sc.nextFloat();

       arr[i] = new Student(reg,nm,dj,sm,gp,cgp);
       try{
         arr[i].validReg();
       }
       catch(SeatFilledException e){
         System.out.println(" Seats full , try next year");
         return;
       }
     }
  }
}
