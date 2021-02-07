import java.util.*;

class Phone{
  String brand;
  int memCapacity;
  Phone(String b, int m){
    brand = b;
    memCapacity = m;
  }
  public interface Callable{
    public void makeAudioCall(String cellNum);
    public void makeVideoCall(String cellNum);

  }
}

class BasicPhone extends Phone implements Phone.Callable{
  BasicPhone(String b,int m ){
    super(b,m);
  }
  public void makeAudioCall(String cellNum){
    System.out.println("Make a audio call from BasicPhone to " + cellNum);
  }

  public void makeVideoCall(String cellNum){
      System.out.println("Make a video call from BasicPhone to " + cellNum);
  }
}

class SmartPhone extends Phone implements Phone.Callable{
  SmartPhone(String b,int m ){
    super(b,m);
  }
  public void makeAudioCall(String cellNum){
    System.out.println("Make a audio call from SmartPhone to " + cellNum);
  }

  public void makeVideoCall(String cellNum){
      System.out.println("Make a video call SmartPhone to " + cellNum);
  }
}

class Question1{
  public static void main(String[] args) {
    BasicPhone b = new BasicPhone("Nokia", 128);
    SmartPhone s = new SmartPhone("Samsung",256);
    b.makeAudioCall("9292929292");
    s.makeVideoCall("999292829");
  }
}
