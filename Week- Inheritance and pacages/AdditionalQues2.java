import java.util.*;



class Students{
  public int roll;
  public int marks;
   void getNumber(){
     System.out.println("Enter Roll Number ");
     int r = sc.nextInt();
     roll = r;
   };
   void putNumber(){
     System.out.println(" Roll Number is "+ marks);
   };
   void getMarks(){
     System.out.println("Enter Marks ");
     int m = sc.nextInt();
     marks = m;
   };
   void putMarks(){
     System.out.println(" Roll Number is "+ marks);
   };

}

class Result extends Students {

  public void  putGrade(){
    System.out.println("Enter Sports Grade ");
    int grade = sc.nextInt();
    System.out.println(" Sports Grade is "+ grade);
  }
  public void res(){
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
