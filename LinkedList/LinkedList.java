import java.util.*;

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

static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
  LinkedList list=new LinkedList();
    //Creating a head pointer
    Node head=null;;
    while(true){
System.out.println("1. CREATE AND APPEND NODE");
System.out.println("2. PRINT elements OF THE LinkedList");
System.out.println("3. exit");
System.out.println("Your choice :");
int choice=sc.nextInt();
switch(choice){
  case 1:Node new_head=list.appendNode(head);
          head=new_head;
          break;
  case 2:list.printElements(head);
      break;
  case 3: System.exit(0);
}
}

}

public Node appendNode(Node head){
System.out.println("Enter data");
int data=sc.nextInt();
  Node new_node=new Node(data);
  if(head==null){
  head=new_node;
  return head;
}
  while(head.next!=null){
    head=head.next;
  }
  head.next=new_node;
  return head;
}

public void printElements(Node head){
  if(head==null){
  System.out.println("LIST IS EMPTY");
}
else{
sc=new Scanner(System.in);
//Printing elements of a LinkedList
  Node temp = head;

  while(temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
  }
}

}
}
