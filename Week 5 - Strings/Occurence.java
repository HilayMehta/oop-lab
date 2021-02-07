import java.util.*;

class Occurence{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.nextLine();
  //  s = sc.nextLine();
    System.out.println("Enter the SubString");
    String sub = sc.nextLine();
    int ls = sub.length();
    int l = str.length();
    int count = 0;
    int temp = -ls;

    while(temp+ls<l){
       temp = str.indexOf(sub, temp+ls);
       if(temp == -1){
         break;
       }
       //System.out.println("pos" + temp);
      String st = str.substring(temp, temp+ls);
      if(st.contentEquals(sub)){
        count++;
          //System.out.println("count is " + count);
      }
    }
    System.out.println("count is " + count);

  }
}
