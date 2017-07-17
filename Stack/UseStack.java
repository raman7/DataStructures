class UseStack{
  public static void main(String args[]){

    Stack st=new Stack(5);

    //push operation
    if(st.push(5)==-1){
      System.out.println("STACK OVERFLOW\n");
    }
    st.push(25);
    //peek operation
    System.out.println(st.peek());

//pop operation
st.pop();

//peek() operation
  System.out.println(st.peek());

  }
}
