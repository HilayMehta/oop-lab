import java.util.*;


interface Sports{
  void putGrade();
}

class Students{
  Scanner sc = new Scanner(System.in);
  int roll;
  int marks;
   void getNumber(){
     System.out.println("Enter Roll Number ");
     int r = sc.nextInt();
     roll = r;
   };
   void putNumber(){
     System.out.println(" Roll Number is "+ roll);
   };
   void getMarks(){
     System.out.println("Enter Marks ");
     int m = sc.nextInt();
     marks = m;
   };
   void putMarks(){
     System.out.println(" Marks is "+ marks);
   };

}

class Result extends Students implements Sports{
  int grade;
Scanner sc = new Scanner(System.in);
  public void putGrade(){
    System.out.println("Enter Sports Grade ");
     grade = sc.nextInt();
    System.out.println(" Sports Grade is "+ grade);
  }
  void res(){
    double finalM = grade + marks;
    System.out.println(" Final Result is "+ finalM);
  }


}
class AdditionalQues2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Result r =  new Result();
    r.getNumber();
    r.getMarks();
    r.putNumber();
    r.putMarks();
    r.putGrade();
    r.res();
  }
}
