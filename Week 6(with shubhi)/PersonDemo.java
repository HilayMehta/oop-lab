import java.util.*;

class Person{
  private String name;
  private String DOB;
  String getName(){
    return name;
  }
  String getDOB(){
    return DOB;
  }
  Person(String name, String DOB){
    this.name  = name;
    this.DOB = DOB;
  }

}

class CollegeGraduate extends Person{
  private double gpa;
  private int year;

  double getGpa(){
    return gpa;
  }
  int getYear(){
    return year;
  }

  CollegeGraduate(String n, String d, double g,int y){
    super(n,d); // superclass constructor
    gpa = g;
    year = y;
  }
}

class PersonDemo{
  public static void main(String[] args) {
    CollegeGraduate c = new CollegeGraduate("Hilay","27/05/2001", 9.14, 2023);
    System.out.println("Name " + c.getName());
    System.out.println("Date of Birth " + c.getDOB());
    System.out.println("GPA " + c.getGpa());
    System.out.println("Year of Graduation " + c.getYear());
  }
}
