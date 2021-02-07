import  java.util.*;

class Student{
  Scanner sc = new Scanner(System.in);
  int roll;
  int marks;
  void getNumber(){
    System.out.println("Enter the Roll Number ");
    roll = sc.nextInt();
  }

  void putNumber(){
    System.out.println("Roll Number is " +  roll);
  }

  void getMarks(){
    System.out.println("Enter the Marks ");
    marks = sc.nextInt();
  }

  void putMarks(){
    System.out.println("Marks is " +  marks);
  }

}
interface Sports{
  void putGrade();
}

class Result extends Student implements Sports{
  int grade;

  public void putGrade(){
    System.out.println("Enter Sports Grade ");
     grade = sc.nextInt();
    System.out.println("Marks obtained in Sports " + grade);
  }

}
