
import structure.Building;
import structure.House;


class Question4{
  public static void main(String[] args){
      Building b = new Building();
      b.setsqFootage(12);
      b.setstories(34);
      System.out.println("sqFootage " + b.getsqFootage());
      House h = new House();
      h.setbedroom(2);
      System.out.println("sqFootage " + h.getbedroom());
  }
}
