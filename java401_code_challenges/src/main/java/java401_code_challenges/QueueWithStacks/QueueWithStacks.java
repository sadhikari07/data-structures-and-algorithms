package java401_code_challenges.QueueWithStacks;


import java401_code_challenges.stack_and_queue.Stack;

public class QueueWithStacks<T> {

    public Stack<T> stack1 = new Stack();
    public Stack<T> stack2 = new Stack();

    public void enqueue(T value){
        stack1.push(value);
    }

    public T dequeue(){
        while(stack1.peek()!=null){
            stack2.push(stack1.pop());
        }
        T dequeuedItem = stack2.pop();
        while(stack2.peek()!=null){
            stack1.push(stack2.pop());
        }
        return dequeuedItem;
    }

}

//Reference: https://moometric.com/development/java/implement-queue-using-2-stacks-in-java/
