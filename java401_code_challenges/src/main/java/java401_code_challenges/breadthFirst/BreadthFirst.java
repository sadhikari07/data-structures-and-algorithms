package java401_code_challenges.breadthFirst;
import java401_code_challenges.tree.BinaryTree;
import java401_code_challenges.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class BreadthFirst {


    public static ArrayList printBreadthFirst(Node current){

        ArrayList newArraylist = new ArrayList();

        Queue<Node> newQueue = new LinkedList<Node>();

        newQueue.add(current);

        if(current == null){
            return null;
        }

        while(!newQueue.isEmpty()){

            Node newNode = (Node)newQueue.remove();
            newArraylist.add(newNode.value);

            System.out.println(newNode.value);

            if(newNode.leftChild!=null){
                newQueue.add(newNode.leftChild);
            }

            if(newNode.rightChild!=null){
                newQueue.add(newNode.rightChild);
            }
        }
        return newArraylist;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.leftChild = new Node(7);
        tree.root.rightChild.rightChild = new Node(9);
        printBreadthFirst(tree.root);
    }


}


//Resource: https://www.baeldung.com/java-binary-tree
