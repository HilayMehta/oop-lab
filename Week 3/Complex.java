import java.util.*;

class Complex{
  int real;
  int imag;
  Complex(){
    real = 0;
    imag = 0;
  }
  Complex(int r,int i){
    real = r;
    imag = i;
  }
  void Display(){
    System.out.println("Real is " + real + " + i " + imag);
  }

  Complex add(Complex c1,Complex c2){
    Complex c = new Complex();
    c.real  = c1.real + c2.real;
    c.imag = c1.imag + c2.imag;
    return c;
  }

  Complex sub(Complex c1,Complex c2){
    Complex c = new Complex();
    c.real  = Math.abs(c1.real - c2.real);
    c.imag = Math.abs(c1.imag - c2.imag);
    return c;
  }

  public static void main(String[] args) {
    Complex ob1 = new Complex(3,4);
    Complex ob2 = new Complex(2,5);
    System.out.println("First Commplex Number is ");

    ob1.Display();
    System.out.println("Second Commplex Number is ");
    ob2.Display();
    System.out.println("Addition of two Complex Number");
    Complex ob3 = ob1.add(ob1,ob2);
    ob3.Display();
    System.out.println("Substraction of two Complex Number");
    Complex ob4 = ob1.sub(ob1,ob2);
    ob4.Display();
  }
}
