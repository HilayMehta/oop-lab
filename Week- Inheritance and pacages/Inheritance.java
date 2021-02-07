import java.util.*;

class Person{
  private String name;
  private int date;
  void setName(String n){
    name = n;
  }
  void setDate(int d){
    date = d;
  }
  String getName(){
    return name;
  }
  int getDate(){
    return date;
  }
}

class CollegeGraduate extends Person{

  private double gpa;
  private int year;
  CollegeGraduate(String n, int d,double g,int y){
    setName(n);
    setDate(d);
    year = y;
    gpa = g;
  }
  double getGpa(){
    return gpa;
  }
  int getYear(){
    return year;
  }
}

class Inheritance{
  public static void main(String[] args){
    CollegeGraduate c = new CollegeGraduate("Hilay",27,9.1,2023);
    System.out.println("Name: "+ c.getName());
    System.out.println("GPA: " + c.getGpa());

  }
}
