package java401_code_challenges.TreeTest;
import java401_code_challenges.tree.BinarySearchTree;
import java401_code_challenges.tree.BinaryTree;
import java401_code_challenges.tree.Node;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java401_code_challenges.tree.BinaryTree.findMax;
import static org.junit.Assert.*;


public class TreeTest {

    @Test
    public void testInstantiateEmptyTree() {
        BinaryTree classUnderTest = new BinaryTree();
        assertNull("New tree's root should be null.", classUnderTest.root);
    }

    @Test
    public void testTreeWithSingleNode() {
        BinarySearchTree classunderTest = new BinarySearchTree();
        classunderTest.add(1);
        int expectedOutput = classunderTest.root.value;
        assertEquals("Root should be the only node in the tree", expectedOutput, 1);

    }

    @Test
    public void testAddingNodes(){
        BinarySearchTree classUnderTest = new BinarySearchTree();
        classUnderTest.add(5);
        classUnderTest.add(6);
        classUnderTest.add(7);
        classUnderTest.add(4);
        classUnderTest.add(3);
        int[] outputRecieved = {classUnderTest.root.leftChild.value, classUnderTest.root.rightChild.value};
        int[] expectedOutput = {4,6};
        assertArrayEquals("Left and right child should have been inserted.", expectedOutput, outputRecieved);
    }

    @Test
    public void testPreOrder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        ArrayList  outputRecieved= tree.preOrder();
        int[] expectedOutput = {1, 2, 4, 5, 3};
        for(int i = 0; i<expectedOutput.length; i++){
            assertEquals("Items should be pre ordered.", expectedOutput[i], outputRecieved.get(i));
        }
    }

    @Test
    public void testInOrder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        ArrayList  outputRecieved= tree.inOrder();
        int[] expectedOutput = {4, 2, 5, 1, 3};
        for(int i = 0; i<expectedOutput.length; i++){
            assertEquals("Items should be in-ordered.", expectedOutput[i], outputRecieved.get(i));
        }
    }

    @Test
    public void testPostOrder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        ArrayList  outputRecieved= tree.postOrder();
        int[] expectedOutput = {4, 5, 2, 3, 1};
        for(int i = 0; i<expectedOutput.length; i++){
            assertEquals("Items should be post-ordered.", expectedOutput[i], outputRecieved.get(i));
        }
    }

    @Test
    public void testFindMaximumValueAtLeft(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        int expectedOutput = 5;

        assertEquals("Maximum value should be 5.", expectedOutput, findMax(tree));
    }

    @Test
    public void testFindMaximumValueAtRoot(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(100);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        int expectedOutput = 100;
        assertEquals("Maximum value should be 100.", expectedOutput, findMax(tree));
    }

    @Test
    public void testFindMaximumValueAtRight(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        int expectedOutput = 30;
        assertEquals("Maximum value should be 100.", expectedOutput, findMax(tree));
    }

    @Test
    public void testFindMaximumValueRepeated(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(30);
        int expectedOutput = 30;
        assertEquals("Maximum value should be 100.", expectedOutput, findMax(tree));
    }

    @Test
    public void testFindMaximumValueBetweenNegatives(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(-1);
        tree.root.leftChild = new Node(-2);
        tree.root.rightChild = new Node(-30);
        tree.root.leftChild.leftChild = new Node(-4);
        tree.root.leftChild.rightChild = new Node(-30);
        int expectedOutput = -1;
        assertEquals("Maximum value should be 100.", expectedOutput, findMax(tree));
    }

}
