import java.io.File;
public class ReadDir{
  public static void main(String[] args) {
    File file = null;
    String[] paths;
    try{
      file = new File("C:\\Users\\HilayMehtaLocal\\Desktop\\Java(3rd Semester)\\Lab Manual\\Week 10");
      paths = file.list();
      for(String path:paths){
        //System.out.println("1");
        System.out.println(path);

      }
    }
      catch(Exception e){
        e.printStackTrace();
      }

  }
}
