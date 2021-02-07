package com.course.structure;

import java.util.*;

public class Building{
  double sqFoot;
  int stories;

public void setSq(double s){
    sqFoot = s;
  }
public void setSt(int stories){
    this.stories = stories;
  }

  public double getsqFootage(){
    return sqFoot;
  }

  public int getstories(){
    return stories;
  }

public static void main(String[] args) {
  System.out.println("HELLO DOBI");
}
}
