import java.io.*;

class Question1{
  public static void displayAll(File path){
    if(path.isFile()){
      System.out.println(path.getName()+ "   is file");

    }
    else{
      System.out.println(path.getName()+ "   is directory");
      File files[] = path.listFiles();
      for(File dirOrFile: files){
        displayAll(dirOrFile);
      }
    }
  }
  public static void main(String[] args) {
    File dirname = new File("C:\\Users\\HilayMehtaLocal\\Desktop\\Java(3rd Semester)\\Lab Manual");
    displayAll(dirname);
  }
}
