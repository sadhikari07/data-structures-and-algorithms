package java401_code_challenges.stack_and_queue;

import java.util.EmptyStackException;

public class Queue<T> {

    public Node<T> front;
    public Node<T> back;


    public Queue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(T value){
        Node<T> newNode = new Node(value);
        newNode.value = value;

        if(this.front == null){
            this.front = newNode;
            this.back = newNode;
        }
        back.next = newNode;
        this.back = newNode;
    }

    public T dequeue(){
        if(this.front == null){
            System.out.println("Nothing in the queue to return");
        }

        T frontValue = this.front.value;
        front = front.next;
        return frontValue;
    }

    public T peek(){
        return this.front.value;
    }

    public static void main(String[] args) {
        Queue newQueue = new Queue();
        System.out.println(newQueue.front);
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        System.out.println(newQueue.peek());
        newQueue.dequeue();
        System.out.println(newQueue.peek());
    }
}

//Reference: https://www.geeksforgeeks.org/queue-set-2-linked-list-implementation/
