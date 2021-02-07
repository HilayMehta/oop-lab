import com.course.structure.House;
import com.course.structure.Building;
import com.course.structure.School;


class BuildingTest{
  public static void main(String[] args) {
    House h = new House();
    School s = new School();

    h.setSq(12000);
    s.setSq(10000);
    h.setSt(4);
    h.setbedroom(2);
    h.setbaths(4);
    System.out.println(" Square foot of house is " + h.getsqFootage());
    System.out.println(" Square foot of School is " + s.getsqFootage());
    //System.out.println("  ")
  }
}
