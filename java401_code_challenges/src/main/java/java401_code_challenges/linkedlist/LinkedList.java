package java401_code_challenges.linkedlist;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;

public class LinkedList {

//Instance variables:

    public Node head;
    public Node tail;

    //This is a constructor:
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return;
    }

    public void insertAfter(int value, int newVal) {
        Node newNode = new Node(newVal);
        Node current = head;
        Node nodeFound = null;
        while (current != null) {
            if (current.value == value) {
                nodeFound = current;
            }
            current = current.next;
        }

        if (nodeFound == null) System.out.println("Match not found exception. The value you entered has no match.");
        else {
            newNode.next = nodeFound.next;
            nodeFound.next = newNode;

        }

    }

    public void insertBefore(int value, int newVal) {
        Node newNode = new Node(newVal);
        Node current = head;
        Node nodeFound = null;
        if (value == head.value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        while (current.next != null) {
            if (current.next.value == value) {
                nodeFound = current;
            }
            current = current.next;
        }

        if (nodeFound == null) {
            System.out.println("Match not found exception. The value you entered has no match.");
        } else {
            newNode.next = nodeFound.next;
            nodeFound.next = newNode;
        }

    }


    public ArrayList<Node> print() {
        Node current = this.head;
        if (current == null) {
            System.out.println("There is nothing on the list right now");
            return null;
        }

        ArrayList<Node> arrayListNodes = new ArrayList<>();
        System.out.println("Here is the list that you created: ");
        while (current != null) {
            arrayListNodes.add(current);
            System.out.println(current.value);
            current = current.next;
        }
        return arrayListNodes;
    }

    public boolean includes(int valueToBeChecked) {
        Node current = head;
        while (current != null) {
            if (current.value == valueToBeChecked) {
                System.out.println("The list includes " + valueToBeChecked);
                return true;
            }
            current = current.next;
        }

        System.out.println("The list does not include " + valueToBeChecked);
        return false;
    }

    public int valueFromEnd(int k) {
        Node current = this.head;
        int counter = 0;
        while (current != null) {
            current = current.next;
            counter++;
        }
        if (counter < k) {
            throw new IllegalArgumentException("Illegal input.");
        }

        current = this.head;
        int iterator = counter - k - 1;
        for (int i = 0; i < iterator; i++) {
            current = current.next;
        }
        return current.value;
    }

     public static LinkedList mergeLists(LinkedList one, LinkedList two){
        Node currentForOne = one.head;
        Node currentForTwo = two.head;
        Node nextForOne;
        Node nextForTwo;

        while (currentForOne != null && currentForTwo !=null){
            nextForOne = currentForOne.next;
            nextForTwo = currentForTwo.next;

            currentForTwo.next = nextForOne;
            currentForOne.next = currentForTwo;

            currentForOne = nextForOne;
            currentForTwo = nextForTwo;
        }
        return one;
    }

    public static LinkedList reverse(LinkedList l1) {

        Node current = l1.head;
        ArrayList<Integer> oneA = new ArrayList();
        while (current!=null){
            oneA.add(current.value);
            current = current.next;
        }

        LinkedList reversedList = new LinkedList();
        for (int i = 0; i<oneA.size(); i++){
            reversedList.insert(oneA.get(i));
        }
        return reversedList;


    }



    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.print();
        System.out.println("........");
        System.out.println("**********");
        reverse(l1).print();
    }
    }


//Reference: https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list
//https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/