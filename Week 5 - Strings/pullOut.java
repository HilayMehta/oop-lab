import java.util.*;


class pullOut{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.nextLine();
  //  s = sc.nextLine();
    System.out.println("Enter the SubString");
    String sub = sc.nextLine();
    String replaceString=str.replaceAll(sub,"");
    System.out.println(replaceString);
}
}
