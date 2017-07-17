import java.util.*;
class Array2Stack{
static int n;
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  StringBuilder sb=new StringBuilder();
  n=sc.nextInt();
  int top1=0;
  int top2=n-1;
  int a[]=new int[n];
  //push operation
  while(true){
    System.out.println("1.PUSH");
    System.out.println("2.POP");
    System.out.println("3.PEEK");
    System.out.println("4.EXIT");
    System.out.println("enter choice");
    int choice=sc.nextInt();
    switch(choice){

      case 1:
            System.out.println(top1+" : "+top2);
            if(top1>top2){
            System.out.println("STACK OVERFLOW!!");
          }
          else{
          System.out.println("enter element");
                  int element=sc.nextInt();
                int option=stackNumber();
                  if(option==1)
                  a[++top1]=element;
                  else if(option==2)
                  a[--top2]=element;
                }

                  break;
      case 2:     int pop_option=stackNumber();
                  if(pop_option==1){
                    if(isStack1Empty(top1))
                    System.out.println("Stack1 is empty");
                    else{
                      top1--;
                    }
                  }
                  else if(pop_option==2){
                    if(isStack2Empty(top2))
                    System.out.println("Stack2 is empty");
                    else{
                      top2++;
                    }
                  }
                  break;
      case 3:     int peek_option=stackNumber();
                    if(peek_option==1){
                      if(isStack1Empty(top1)){
                        System.out.println("Stack1 is empty");
                      }
                      else
                    System.out.println(a[top1]);

                  }
                    else if(peek_option==2){
                      if(isStack2Empty(top2)){
                          System.out.println("Stack2 is empty");
                      }
                      else
                    System.out.println(a[top2]);

                  }
                    break;
      case 4: System.exit(1);
    }

  }


  }

public static boolean isStack1Empty(int top1){
  return top1<0;
}

public static boolean isStack2Empty(int top2){
  return top2==n;
}
  public static int  stackNumber(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter stack number(1 or 2)");
    int t=sc.nextInt();
    return t;
  }

}
