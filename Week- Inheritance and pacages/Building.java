package structure;
import java.util.*;

public class Building{
  int sqFootage;
  int stories;
  public void setsqFootage(int sq){
    sqFootage = sq;
  }
  public void setstories(int s){
    stories = s;
  }

  public int getsqFootage(){
    return sqFootage;
  }

  public int getstories(){
    return stories;
  }
}

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

/*class School extends Building{
  int classroom;
  String gradeLevel;
}*/
