import java.util.*;

 class InvalidDayException extends Exception{
  int d;
  public InvalidDayException(int d){
    this.d = d;
  }

  public int getDay(){
    return d;
  }
}

 class InvalidMonthException extends Exception{
  int m;
  public InvalidMonthException(int m){
    this.m = m;
  }
  public int getMonth(){
    return m;
  }
}

class CurrentDate{
  int day;
  int month;
  int year;

    public CurrentDate(int d,int m, int y){
    day = d;
    month = m;
    year = y;
  }

  public void verifyday() throws InvalidDayException{
    if(day >31){
      throw new InvalidDayException(day);
    }

  }
 public void verifyMonth() throws InvalidMonthException{
   if(month >12){
     throw new InvalidMonthException(month);
   }
 }
  /*public CurrentDate createDate(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day");
    int d = sc.nextInt();
    System.out.println("Enter the month");
    int m = sc.nextInt();
    System.out.println("Enter the year");
    int y = sc.nextInt();
    CurrentDate cr = new CurrentDate(d,m,y);
    return cr;
  }*/

  public void Display(){
   System.out.println("Day " + day+ " Month " + month + " Year " + year);
 }
  public static void main(String[] args) {
    int counter = 0;
    CurrentDate cd =new CurrentDate(32,13,2001);
    try{
      cd.verifyday();
      //cd.verifyMonth();
    }
    catch(InvalidDayException e){
      System.out.println("Invalid day entered " + e.getDay());
      counter = 1;

    }

    try{
      cd.verifyMonth();
    }
    catch(InvalidMonthException es){
      System.out.println("Invalid Month entered " + es.getMonth());
      counter = 1;
    }
    if(counter ==0){
      cd.Display();
    }

  }
}


/*class Question2{
  public static void main(String[] args) {
      CurrentDate cd = createDate();
  }
}*/
