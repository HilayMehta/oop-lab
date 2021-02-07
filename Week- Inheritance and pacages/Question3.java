import java.util.*;

abstract class Figure{
  int a,b;
  abstract void area();
}

class rectangle extends Figure{
  rectangle(int l,int b){
    a = l;
    this.b = b;
  }
  void area(){
    System.out.println("Area of rectangle is:  "+ a*b );
  }
}

class triangle extends Figure{
  triangle(int base,int height){
    a = base;
    b = height;
  }
  void area(){
    System.out.println("Area of triangle is:  "+ 0.5*a*b );
  }
}

class square extends Figure{
  square(int s){
    a= s;
    b = s;
  }
  void area(){
    System.out.println("Area of square is:  "+ a*b );
  }
}
class Question3{
  public static void main(String[] args){
    Figure fifref;
    rectangle r = new rectangle(5,6);
    square s = new square(5);
    triangle t = new triangle(2,4);
    fifref = r;
    fifref.area();
    fifref = s;
    fifref.area();
    fifref = t;
    fifref.area();

  }
}
