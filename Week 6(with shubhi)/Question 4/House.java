package com.course.structure;

public class House extends Building{
  int bedroom;
  int baths;

  public void setbedroom(int bd){
    bedroom = bd;
  }
  public void setbaths(int b){
    baths = b;
  }

  public int getbedroom(){
    return bedroom;
  }

  public int getbaths(){
    return baths;
  }
}
