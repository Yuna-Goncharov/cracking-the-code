//implement stack

public class stack {

  private int max = 1000;
  private int top;
   int a[] = new int[max];

  public boolean isEmpty(){
      return (top < 0);
  }

  public stack(){
      top = -1;
  }

  public boolean push(int x){
      if(top >= max-1){
          System.out.println("stack overFlow");
          return false;
      }
      else{
        a[++top] = x;
        System.out.println("Pusshed" + x);
        return true;
      }
  }

  public int pop(){
      if(top < 0){
          System.out.println("stack underFlow");
          return 0;
      }
      else{
        int x =  a[top--];
        return x;
      }
  }
}

    class Main
    {
        public static void main(String args[])
        {
            stack s = new stack();
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.pop() + " Popped from stack");
        }
    }

