package java401_code_challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void testAddsKeySuccesfully() {
        HashTable classUnderTest = new HashTable();
        classUnderTest.add("Item1", 1);
        int index = classUnderTest.getHash("Item1")%classUnderTest.bucketsArray.length;
        assertEquals("There should be an item with key Item1 stored", "Item1", classUnderTest.bucketsArray[index].head.key);
    }

    @Test
    public void testAddsValueSuccesfully() {
        HashTable classUnderTest = new HashTable();
        classUnderTest.add("Item1", 1);
        int index = classUnderTest.getHash("Item1")%classUnderTest.bucketsArray.length;
        assertEquals("There should be an item with value of 1 stored", 1, classUnderTest.bucketsArray[index].head.value);
    }

    @Test
    public void testReturnsSuccesfully() {
        HashTable classUnderTest = new HashTable();
        classUnderTest.add("Item1", 1);
        classUnderTest.add("Item2", 2);
        classUnderTest.add("Item3", 3);
        assertEquals("Should return proper key value pair.", 3, classUnderTest.get("Item3"));
    }

    @Test
    public void testReturnsNull() {
        HashTable classUnderTest = new HashTable();
        classUnderTest.add("Item1", 1);
        assertNull("Should return null for non existing keys.", classUnderTest.get("Item5"));
    }

    @Test
    public void testSuccesfulCollisionHandling() {
        HashTable classUnderTest = new HashTable();
        classUnderTest.add("P", 1);
        classUnderTest.add("((", 2);
        classUnderTest.add("Item3", 3);
        classUnderTest.add("Item3", 4);
        int index = classUnderTest.getHash("((")%classUnderTest.bucketsArray.length;
        assertEquals("Collision should be handled properly.", 1, classUnderTest.bucketsArray[index].head.value);
        assertEquals("Collision should be handled properly.", 2, classUnderTest.bucketsArray[index].head.next.value);
    }

    @Test
    public void testSuccesfulRetrieveFromCollision() {
        HashTable classUnderTest = new HashTable();
        classUnderTest.add("P", 1);
        classUnderTest.add("((", 2);
        classUnderTest.add("Item3", 3);
        classUnderTest.add("Item3", 4);
        assertEquals("Coliision should be handled properly.", 1, classUnderTest.get("P"));
    }


    @Test
    public void testSuccesfulHashingKey() {
        HashTable classUnderTest = new HashTable();
        classUnderTest.add("P", 1);
        classUnderTest.add("((", 2);
        assertEquals("Hashed codes for P and (( should be same", classUnderTest.getHash("P"), classUnderTest.getHash("(("));
    }


}