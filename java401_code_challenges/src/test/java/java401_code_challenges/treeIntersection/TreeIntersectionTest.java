package java401_code_challenges.treeIntersection;

import java401_code_challenges.tree.BinaryTree;
import java401_code_challenges.tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static java401_code_challenges.treeIntersection.TreeIntersection.treeIntersectionSet;
import static org.junit.Assert.*;


public class TreeIntersectionTest {


    @Test
    public void testSuccesfulSizeReturn() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(10);
        tree1.root.leftChild = new Node(2);
        tree1.root.rightChild = new Node(30);

        ArrayList newArr = treeIntersectionSet(tree, tree1);
        assertEquals("Return should have 5 individual items.", 1, newArr.size());
    }


    @Test
    public void testSuccesfulItemsReturn() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(10);
        tree1.root.leftChild = new Node(2);
        tree1.root.rightChild = new Node(30);
        int[] expectedContains = {2};
        ArrayList newArr = treeIntersectionSet(tree, tree1);

        for(int i = 0; i < expectedContains.length; i++) {
            assertTrue("Items should be contained in the return.", newArr.contains(expectedContains[i]));
        }
    }

    @Test
    public void testWithOneEmptyTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);

        BinaryTree tree1 = new BinaryTree();
        int[] expectedContains = {1, 2, 3};
        ArrayList newArr = treeIntersectionSet(tree, tree1);

        for(int i = 0; i < expectedContains.length; i++) {
            assertTrue("There should be no items in the return.", !newArr.contains(expectedContains[i]));
        }
    }

    @Test
    public void testWithBothEmptyTree() {
        BinaryTree tree = new BinaryTree();
        BinaryTree tree1 = new BinaryTree();
        ArrayList newArr = treeIntersectionSet(tree, tree1);
        assertEquals("Return should contain 0 items.", 0, newArr.size());
    }

    @Test
    public void testTreesWithSameItems() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(1);
        tree1.root.leftChild = new Node(2);
        tree1.root.rightChild = new Node(3);
        ArrayList newArr = treeIntersectionSet(tree, tree1);
        assertEquals("Return should contain 3 items.", 3, newArr.size());
    }


    @Test
    public void testTreeWithNoSameItems() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(11);
        tree.root.leftChild = new Node(111);
        tree.root.rightChild = new Node(1111);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(10);
        tree1.root.leftChild = new Node(2);
        tree1.root.rightChild = new Node(3);
        ArrayList newArr = treeIntersectionSet(tree, tree1);
        assertEquals("Return should contain 0 items.", 0, newArr.size());
    }

}