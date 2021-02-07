import  java.util.*;

  class Node{
    int value;
    Node next;

    Node(int d){
      value = d;
      next = null;
    }
  }

class LinkedList{

  Node head;  // members
  public static void main(String[] args) {

      LinkedList l = new LinkedList();
      l.head = new Node(1);
      Node second = new Node(2);
      Node third = new Node(3);
      l.head.next = second;
      second.next = third;

      while(l.head !=null){
        System.out.println(l.head.value + " ");
        l.head = l.head.next;
      }
  }
}
