package java401_code_challenges.tree;

import sun.misc.Queue;

public class BinarySearchTree {

    public Node<Integer> root;
    public Node<Integer> current;
    public Node<Integer> leftChild;
    public Node<Integer> rightChild;
    boolean doesItContain = false;

    public Node addNode(Node<Integer> current, int toBeAdded){
       if(current == null){
           return new Node(toBeAdded);
       }

       if(toBeAdded<current.value){
           current.leftChild = addNode(current.leftChild, toBeAdded);
       }

       else if(toBeAdded>current.value){
           current.rightChild = addNode(current.rightChild, toBeAdded);
       }
       else {
           return current;
       }
       return current;
    }

    public void add(int toBeAdded){
        root = addNode(root, toBeAdded);
    }



    public boolean containsNode(Node<Integer> current, int searchValue){
        if(current.value == null){
            System.out.println("Value not found.");
            return doesItContain;
        }

        else if(current.value == searchValue){
            System.out.println("Found the item.");
            return true;
        }

        if (current.value < searchValue) {

            if(current.rightChild == null){
                System.out.println("Value not found.");
                return doesItContain;
            }

            else {
                current = current.rightChild;
                containsNode(current, searchValue);
            }
        }


        else {

            if(current.leftChild == null){
                System.out.println("Value not found.");
                return doesItContain;
            }

            else {
                current = current.leftChild;
                containsNode(current, searchValue);
            }
        }
        return doesItContain;
    }

    public boolean contains(int searchValue){
        return containsNode(root, searchValue);
    }

}





//Reference: https://www.baeldung.com/java-binary-tree