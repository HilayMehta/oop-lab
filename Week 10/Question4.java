import java.util.*;
import java.io.*;



public class Question4 {
   public static void main(String args[]) throws IOException
   {
      FileReader in= null;
      FileWriter out = null;

      try {
         in = new FileReader("C:\\Users\\HilayMehtaLocal\\Desktop\\Java(3rd Semester)\\Lab Manual\\Week 10\\Input.txt");
         out = new FileWriter("outputQuestion4.txt");

         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
