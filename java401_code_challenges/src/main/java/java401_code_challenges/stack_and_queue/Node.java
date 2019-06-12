package java401_code_challenges.stack_and_queue;

import java401_code_challenges.linkedlist.LinkedList;

import java.lang.reflect.Type;

public class Node <T>{
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
       Node next;
    }

//    public T getValue(){
//        return value;
//    }

}
