package java401_code_challenges.linkedlist;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testLinkedListEmpty() {
        LinkedList classUnderTest = new LinkedList();
        LinkedList.Node expectedOutput = null;
        LinkedList.Node outputRecieved =classUnderTest.head;
        assertEquals("There should be nothing in the list!", expectedOutput, outputRecieved);
    }

    @Test
    public void testInsertIntoList(){
        LinkedList classUnderTest = new LinkedList();
        int expectedOutput = 1;
        classUnderTest.insert(1);
        int outputRecieved = classUnderTest.head.value;
        assertEquals("Node's value should be 1!", expectedOutput, outputRecieved);
    }

    @Test
    public void testFindHead(){
        LinkedList classUnderTest = new LinkedList();
        int expectedOutput = 1;
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        int outputRecieved = classUnderTest.head.value;
        assertEquals("Head's value should be 1!", expectedOutput, outputRecieved);
    }

    @Test
    public void testInsertMultipleHeads(){
        LinkedList classUnderTest = new LinkedList();
        int expectedOutput = 3;
        classUnderTest.insert(5);
        classUnderTest.insert(6);
        classUnderTest.insert(7);
        int outputRecieved = classUnderTest.print().size();
        assertEquals("List should be of size 3!", expectedOutput, outputRecieved);
    }

    @Test
    public void testIfValueExists(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        assertTrue("2 should be included in the list", classUnderTest.includes(2));
    }

    @Test
    public void testIfValueDoesNotExists(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        assertFalse("5 should be included in the list", classUnderTest.includes(5));
    }

    @Test
    public void testReturnList(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        int[] arrayToTestValues = {3, 2, 1};
        ArrayList<LinkedList.Node> expectedOutput = classUnderTest.print();
        int i = 0;
        while(i<3){
            assertEquals("The list should have 1, 2, and 3", arrayToTestValues[i], expectedOutput.get(i).value);
            i++;
        };
    }

    @Test
    public void testAppendsToLast(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.append(5);
        assertEquals("Last item on the list should be 5", 5, classUnderTest.print().get(3).value);
    }

    @Test
    public void testAppendsMultipleToLast(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.append(5);
        classUnderTest.append(6);
        assertEquals("LSum of fourth and fifth item should be 11", 11, classUnderTest.print().get(3).value+classUnderTest.print().get(4).value);
    }

    @Test
    public void testInsertBeforeMiddle() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insertBefore(2, 11);
        assertEquals("Second item should be 11", 11, classUnderTest.print().get(1).value);
    }

    @Test
    public void testInsertBeforeFirst() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insertBefore(3, 11);
        assertEquals("First item should be 11", 11, classUnderTest.print().get(0).value);
    }

    @Test
    public void testInsertAfterMiddle() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insertAfter(2, 11);
        assertEquals("Third item should be 11", 11, classUnderTest.print().get(2).value);
    }

    @Test
    public void testInsertAfterLast() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insertAfter(1, 11);
        assertEquals("First item should be 11", 11, classUnderTest.print().get(3).value);
    }

    @Test
    (expected = IllegalArgumentException.class)
    public void testValueFromEndKmoreThanLength() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(4);
        classUnderTest.insert(5);
        classUnderTest.insert(6);
        int k = 7;
        classUnderTest.valueFromEnd(k);
    }

    @Test
    public void testValueFromEndSameLength() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(4);
        classUnderTest.insert(5);
        classUnderTest.insert(6);
        int k = 6;
        assertEquals("First item should be 1", 6, classUnderTest.valueFromEnd(k));
    }

    @Test
    public void testValueFromEndSizeOne() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        int k = 0;
        assertEquals("First item should be 1", 1, classUnderTest.valueFromEnd(k));
    }

    @Test
    public void testValueFromEnd() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(4);
        classUnderTest.insert(5);
        classUnderTest.insert(6);
        int k = 2;
        assertEquals("First item should be 1", 3, classUnderTest.valueFromEnd(k));
    }



}
