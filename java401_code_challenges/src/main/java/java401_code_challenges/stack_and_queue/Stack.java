package java401_code_challenges.stack_and_queue;

public class Stack {

   public Node top;


  public Stack(){
      this.top = null;
  }

  public void push(int value){
      Node newNode = new Node(value);
      if (newNode == null){
          System.out.println("Cannot insert null.");
          return;
      }
      newNode.value = value;
      newNode.next = top;
      top = newNode;
  }

  public int pop(){
      if (top == null){
          System.out.println("Nothing on the stack to return.");
          return -1;
      }
      int topValue = top.value;
      top = top.next;
      return topValue;
  }


    public int peek(){
      if (top == null){
          System.out.println("Cannot peek into the thing that doesn't exist.");
          return -1;
        }
      return top.value;
    }

    public static void main(String[] args) {
      Stack newStack = new Stack();
      newStack.push(1);
      newStack.push(2);
      newStack.push(3);
      newStack.push(4);
      newStack.push(5);
         System.out.println(newStack.peek());
      newStack.pop();
        System.out.println(newStack.peek());
    }
}


//Reference: https://www.geeksforgeeks.org/implement-a-stack-using-singly-linked-list/


