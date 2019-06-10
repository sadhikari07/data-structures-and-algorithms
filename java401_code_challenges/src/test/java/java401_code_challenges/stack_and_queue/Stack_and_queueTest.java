package java401_code_challenges.stack_and_queue;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Stack_and_queueTest {
    @Test
    public void testPushItem() {
        Stack classUnderTest = new Stack();
        Stack newStack = new Stack();
        newStack.push(1);
        assertEquals("The value of first item on the stack should be 1.", newStack.top.value, 1);
    }

    @Test
    public void testPushMultipleItems() {
        Stack classUnderTest = new Stack();
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(11);
        newStack.push(111);
        newStack.push(1111);
        newStack.push(11111);
        int itemCounter = 0;
        while(newStack.top!=null){
            itemCounter = itemCounter+1;
            newStack.top = newStack.top.next;
        }
        assertEquals("There should be 5 items in the stack.", itemCounter, 5);
    }

    @Test
    public void testPopItem() {
        Stack classUnderTest = new Stack();
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(11);
        newStack.push(111);
        newStack.push(1111);
        newStack.push(11111);
        newStack.pop();
        assertEquals("The value of first item on the stack should be 11111 after popping.", newStack.top.value, 1111);
    }

    @Test
    public void testEmptyStack() {
        Stack classUnderTest = new Stack();
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(11);
        newStack.push(111);
        newStack.pop();
        newStack.pop();
        newStack.pop();
        assertEquals("Empty stack should consist of null node.", newStack.top, null);
    }

    @Test
    public void testPeekStack() {
        Stack classUnderTest = new Stack();
        Stack newStack = new Stack();
        newStack.push(0);
        newStack.push(1);
        newStack.push(2);
        int expectedOutcome = newStack.peek();
        assertEquals("Peeked itm should be last item inserted.", expectedOutcome, 2);
    }

    @Test
    public void testInstantiateEmptyStack() {
        Stack classUnderTest = new Stack();
        Stack newStack = new Stack();
       assertEquals("Empty stack should be instantiated.", newStack.top, null);
    }

    @Test
    public void testEnqueInsert() {
        Queue newQueue = new Queue();
        newQueue.enqueue(1);
        assertEquals("The front item inserted should have value 1.", 1, newQueue.front.value);
    }

    @Test
    public void testEnqueMultipleInsert() {
        Queue newQueue = new Queue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        int itemCounter = 0;
        while(newQueue.front!=null){
            itemCounter = itemCounter+1;
            newQueue.front = newQueue.front.next;
        }
        assertEquals("There should be 4 items in the queue.", itemCounter, 4);
    }

    @Test
    public void testDeque() {
        Queue newQueue = new Queue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        int dequedItem = newQueue.dequeue();
        assertEquals("The item dequed should be the first item that was on the queue.", dequedItem, 1 );
    }

    @Test
    public void testPeek() {
        Queue newQueue = new Queue();
        newQueue.enqueue(11);
        newQueue.enqueue(21);
        newQueue.enqueue(31);
        newQueue.enqueue(41);
        int peekedItem = newQueue.peek();
        assertEquals("The item dequed should be the first item that was on the queue.", peekedItem, 11 );
    }

    @Test
    public void testEmptyQueue() {
        Queue newQueue = new Queue();
        newQueue.enqueue(11);
        newQueue.enqueue(21);
        newQueue.enqueue(31);
        newQueue.enqueue(41);
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        assertEquals("Only null should be remaining in the queue.", newQueue.front, null);
    }

    @Test
    public void testInstantiateEmptyQueue() {
        Queue newQueue = new Queue();
        assertEquals("Empty stack should be instantiated.", newQueue.front, null);
    }


}
