class Stack{

int stack[],n,top=0;

Stack(int n){
  stack=new int[n];
  this.n=n;
}

public int push(int element){
  if (top==n) {
    return -1;
  }
  stack[top++] = element;
  return 0;
}

public int pop(){
  if(top==-1){
    return -1;
  }
  top--;
return 0;
}

public int peek(){
  top--;
  if(top<0)
  {
    return -1;
  }
  return stack[top];
}



}
