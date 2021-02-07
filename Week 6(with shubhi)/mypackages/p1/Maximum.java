package p1;

import java.util.*;

public class Maximum{
  public int max(int x,int y,int z){
    int res=(x>y)?((x>z)?x:z):((y>z)?y:z);
		return res;
  }

  public float max(float x, float y,float z){
    float res=(x>y)?((x>z)?x:z):((y>z)?y:z);
		return res;
  }

  /*public static void main(String[] args){
    Maximum m = new Maximum();
    int res = m.max(3,5,7);
    System.out.println(res);
  }*/
}
