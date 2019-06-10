package java401_code_challenges.QueueWithStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueWithStacksTest {

    @Test
    public void testEnqueInsert() {
        QueueWithStacks newQueue = new QueueWithStacks();
        newQueue.enqueue(1);
        int expectedOutput = newQueue.stack1.peek();
        assertEquals("The front item inserted should have value 1.", 1, expectedOutput);
    }


    @Test
    public void testDeque() {
        QueueWithStacks newQueue = new QueueWithStacks();
        newQueue.enqueue(10);
        newQueue.enqueue(20);
        newQueue.enqueue(30);
        newQueue.enqueue(40);
        int dequedItem = newQueue.dequeue();
        assertEquals("The item dequed should be the first item that was on the queue.", dequedItem, 10 );
    }


    @Test
    public void testEmptyQueue() {
        QueueWithStacks newQueue = new QueueWithStacks();
        newQueue.enqueue(5);
        newQueue.enqueue(10);
        newQueue.enqueue(15);
        newQueue.enqueue(20);
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        assertEquals("Only null should be remaining in the queue.", newQueue.stack1.peek(), null);
    }

    @Test
    public void testEnqueMultipleInsert() {
        QueueWithStacks newQueue = new QueueWithStacks();
        newQueue.enqueue(-10);
        newQueue.enqueue(-20);
        newQueue.enqueue(-30);
        newQueue.enqueue(-40);
        int itemCounter = 0;
        while(newQueue.stack1.peek()!=null){
            itemCounter = itemCounter+1;
            newQueue.stack1.pop();
        }
        assertEquals("There should be 4 items in the queue.", itemCounter, 4);
    }
}