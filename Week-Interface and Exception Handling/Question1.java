import java.util.*;



class phone {
  public String brand;
  public int memCapacity;
  public interface callable{
    public void makeAudioCall(String cellNum);
    public void makeVideoCall(String cellNum);
  }
  }
class BasicPhone extends phone implements phone.callable{
  BasicPhone(String brand,int memCapacity){
    this.brand = brand;
    this.memCapacity = memCapacity;
  }
  public void makeAudioCall(String cellNum){
    System.out.println("Make a audio call to this cellNum:" + cellNum);
    System.out.println("Brand Name" + brand);
    System.out.println("memCapacity is"+ memCapacity);
  }
  public void makeVideoCall(String cellNum){
    System.out.println("Make a video call to this cellNum:" + cellNum);
    System.out.println("Brand Name" + brand);
    System.out.println("memCapacity is"+ memCapacity);
  }
}
class SmartPhone extends phone implements phone.callable{
  SmartPhone(String brand,int memCapacity){
    this.brand = brand;
    this.memCapacity = memCapacity;
  }
  public void makeAudioCall(String cellNum){
    System.out.println("Make a audio call to this cellNum:" + cellNum);
    System.out.println("Brand Name" + brand);
    System.out.println("memCapacity is"+ memCapacity);
  }
  public void makeVideoCall(String cellNum){
    System.out.println("Make a video call to this cellNum:" + cellNum);
    System.out.println("Brand Name" + brand);
    System.out.println("memCapacity is"+ memCapacity);
  }

}
class Question1{
   public static void main(String[] args) {
    BasicPhone b = new BasicPhone("samsung",1000);
    SmartPhone s = new SmartPhone("Oneplus",20000);
    b.makeAudioCall("9999999");
    b.makeVideoCall("0999999");
    b.makeAudioCall("9999999");
    b.makeVideoCall("0999999");
  }
}
