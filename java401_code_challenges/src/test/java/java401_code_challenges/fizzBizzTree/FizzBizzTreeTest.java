package java401_code_challenges.fizzBizzTree;

import java401_code_challenges.tree.BinaryTree;
import java401_code_challenges.tree.Node;
import org.junit.Assert;
import org.junit.Test;

import static java401_code_challenges.FizzBizzTree.FizzBuzzTree.fizzBizz;
import static org.junit.Assert.assertEquals;

public class FizzBizzTreeTest {

    @Test
    public void testRootChange(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.leftChild = new Node(17);
        tree.root.rightChild = new Node(7);
        fizzBizz(tree);
        assertEquals("Root's value should be changed.", "Buzz", tree.root.value);
    }

    @Test
    public void testLeftChange(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(7);
        tree.root.leftChild = new Node(5);
        tree.root.rightChild = new Node(9);
        fizzBizz(tree);
        assertEquals("Left node's value should be changed.", "Buzz", tree.root.leftChild.value);
    }

    @Test
    public void testRightChange(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(7);
        tree.root.leftChild = new Node(5);
        tree.root.rightChild = new Node(9);
        fizzBizz(tree);
        assertEquals("Right node's value should be changed.", "Fizz", tree.root.rightChild.value);

    }

    @Test
    public void testChange3(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(6);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(7);
        fizzBizz(tree);
        assertEquals("Root's value should be changed to Fizz.", "Fizz", tree.root.value);

    }

    @Test
    public void testChange5(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(7);
        fizzBizz(tree);
        assertEquals("Root's value should be changed to Buzz.", "Buzz", tree.root.value);

    }

    @Test
    public void testChange15(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(15);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(7);
        fizzBizz(tree);
        assertEquals("Root's value should be changed to FizzBuzz.", "FizzBuzz", tree.root.value);
    }

}
