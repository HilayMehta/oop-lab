package com.course.structure;

public class School extends Building{
  int classrooms;
  int grade;

  public void setclassroom(int classrooms){
    this.classrooms  =  classrooms;
  }

  public void setgrade(int grade){
    this.grade = grade;
  }

  public int getclassroom(){
    return classrooms;
  }

  public int getgrade(){
    return grade;
  }
}
