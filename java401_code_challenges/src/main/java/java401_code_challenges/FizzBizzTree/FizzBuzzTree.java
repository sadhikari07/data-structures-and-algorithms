package java401_code_challenges.FizzBizzTree;

import java401_code_challenges.tree.BinaryTree;
import java401_code_challenges.tree.Node;

public class FizzBuzzTree {


        public static void fizzerBizzer(Node current){
            if(current.value == null){
                return;
            }


            else {
                    if((Integer) current.value%3 == 0 && (Integer) current.value%5 != 0){
                        current.value = "Fizz";
                    }

                    else if((Integer) current.value%5 == 0 && (Integer) current.value%3 != 0) {
                        current.value = "Buzz";
                    }

                    else if((Integer) current.value%3 == 0 && (Integer) current.value%5 == 0) {
                        current.value = "FizzBuzz";
                    }

                    if(current.leftChild != null){
                        fizzerBizzer(current.leftChild);
                    }


                    if(current.rightChild != null){
                        fizzerBizzer(current.rightChild);
                    }

            }

        }

    public static void fizzBizz(BinaryTree tree){
            fizzerBizzer(tree.root);
        System.out.println(tree.inOrder());
    }


    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(7);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.leftChild = new Node(24);
        tree.root.rightChild.rightChild = new Node(15);
        fizzBizz(tree);
    }

}
