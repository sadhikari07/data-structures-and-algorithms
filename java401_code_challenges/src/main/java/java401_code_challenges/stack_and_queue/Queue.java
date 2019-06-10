package java401_code_challenges.stack_and_queue;

import java.util.EmptyStackException;

public class Queue {

    public Node front;
    public Node back;


    public Queue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        newNode.value = value;

        if(this.front == null){
            this.front = newNode;
            this.back = newNode;
        }
        back.next = newNode;
        this.back = newNode;
    }

    public int dequeue(){
        if(this.front == null){
            System.out.println("Nothing in the queue to return");
            return -1;
        }

        int frontValue = front.value;
        front = front.next;
        return frontValue;
    }

    public int peek(){
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
