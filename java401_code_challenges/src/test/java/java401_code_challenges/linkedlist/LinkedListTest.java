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


}
