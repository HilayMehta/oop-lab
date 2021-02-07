import java.util.*;

class PushException extends Exception{

}
class PopException extends Exception{

}

class Stack{
  int top ; // points to top of the stack
  int arr[] = new int[100];  // using array

  Stack(){
    top = -1;
  }

  void push(int val) throws PushException{
    if(top >= 4){
      throw new PushException();
    }
    top++;
    arr[top] = val;
  }

  int pop() throws PopException{
    //isempty
    if(top==-1){
      throw new PopException();
    }
    int x = arr[top];
    top--;
    return x;
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    try{
      for(int j = 0;j<6;j++){
        s.push(j);
      }
    }
    catch(PushException e){
      System.out.println("Stack is Full");
    }

    try{
      for(int j = 0;j<6;j++){
        int d = s.pop();
        System.out.println(" popped element is " + d);
      }


    }
    catch(PopException e){
      System.out.println("Stack is Empty");
    }

  }
}
