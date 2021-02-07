import java.util.*;

abstract class Figure{
  int a;
  int b;
  abstract void area(int x,int y);
}

class Rectangle extends Figure{
  void area(int x,int y){
    System.out.println("Area Of Rectangle is " +  x*y);
  }
}

class Triangle extends Figure{
  void area(int x,int y){
    System.out.println("Area Of Triangle is " +  0.5*x*y);
  }
}

class Square extends Figure{
  void area(int x,int y){
    System.out.println("Area of Square is " +  x*y);
  }
}

class Abstract{
  public static void main(String[] args) {
      //Figure f = new Figure();
      Rectangle r = new Rectangle();
      Triangle t = new Triangle();
      Square s = new Square();
      Figure ref ;
      ref = r;
      ref.area(3,5);
      ref = t;
      ref.area(2,4);
      ref = s;
      ref.area(4,4);
  }
}
