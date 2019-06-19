package java401_code_challenges.breadthFirst;

import java401_code_challenges.tree.BinaryTree;
import java401_code_challenges.tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static java401_code_challenges.FizzBizzTree.FizzBuzzTree.fizzBizz;
import static java401_code_challenges.breadthFirst.BreadthFirst.printBreadthFirst;
import static org.junit.Assert.assertEquals;

public class BreadthFirstTest {

    @Test
    public void testSizeOrder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.leftChild = new Node(7);
        tree.root.rightChild.rightChild = new Node(9);
        int expected = 7;
        ArrayList actual = printBreadthFirst(tree.root);
        assertEquals("Output should be displayed in breadth first.", expected, actual.size());

    }

    @Test
    public void testOrder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.leftChild = new Node(7);
        tree.root.rightChild.rightChild = new Node(9);
        int[] expected = {1, 2, 3, 4 ,5, 7, 9};
        ArrayList actual = printBreadthFirst(tree.root);
        for(int i = 0; i<expected.length; i++){
            assertEquals("Output should be displayed in breadth first.", expected[i], actual.get(i));
        }
    }

    @Test
    public void testOrderForLeftUneven(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.rightChild = new Node(3);
        tree.root.rightChild.leftChild = new Node(7);
        tree.root.rightChild.rightChild = new Node(9);
        int[] expected = {1, 3, 7, 9};
        ArrayList actual = printBreadthFirst(tree.root);
        for(int i = 0; i<expected.length; i++){
            assertEquals("Output should be displayed in breadth first.", expected[i], actual.get(i));
        }
    }

    @Test
    public void testOrderForRightUneven(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(7);
        tree.root.leftChild.rightChild = new Node(9);
        int[] expected = {1, 3, 7, 9};
        ArrayList actual = printBreadthFirst(tree.root);
        for(int i = 0; i<expected.length; i++){
            assertEquals("Output should be displayed in breadth first.", expected[i], actual.get(i));
        }
    }



}
