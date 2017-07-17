class LinkedList{
  static class Node{
    int data;
    Node prev;
    Node next;
  Node(int data){
  this.data=data;
  this.prev=null;
  this.next=null;
  }
  }

public static void main(String args[]){
    //Creating a head pointer
    Node head;
    //create a Node
    Node first = new Node(1);
    head = first;
    first.prev = head;
    first.next=null;

    //insert a second Node
    Node second = new Node(2);
    first.next=second;
    second.prev = first;
    second.next=null;
//insert at the beginning of LinkedList
Node third = new Node(10);
third.next=head;
head=third;
third.prev = head;

    //Printing elements of a Linked List
    Node temp = head;
    while(temp!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }

}
}
