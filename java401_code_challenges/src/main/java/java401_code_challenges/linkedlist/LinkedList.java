package java401_code_challenges.linkedlist;

import java.util.ArrayList;

public class LinkedList {
//Instance variables:

    public Node head;
    public Node tail;

//This is a constructor:
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    class Node{
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }



    public void insert(int value) {
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }


    public ArrayList<Node> print(){
        Node current = this.head;
        if(current == null) {
            System.out.println("There are nothing on the list right now");
            return null;
        }

        ArrayList<Node> arrayListNodes = new ArrayList<>();
        System.out.println("Here is the list that you created: ");
        while(current != null) {
            arrayListNodes.add(current);
            System.out.println(current.value);
            current = current.next;
        }
        return arrayListNodes;
    }

    public boolean includes(int valueToBeChecked){
        Node current = head;
        boolean valueChecker = false;
        while (current!=null){
            if (current.value == valueToBeChecked){
                System.out.println("The list includes " + valueToBeChecked);
                return true;
            }
            current = current.next;
        }

        System.out.println("The list does not include " + valueToBeChecked);
        return false;
    }



    public static void main(String[] args) {
        LinkedList newListCreator = new LinkedList();

        newListCreator.insert(1);
        newListCreator.insert(2);
        newListCreator.insert(3);
        newListCreator.insert(4);

        //Displays the nodes present in the list
        newListCreator.print();
        newListCreator.includes(4);
        newListCreator.includes(5);
    }
}



//Reference: https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list
