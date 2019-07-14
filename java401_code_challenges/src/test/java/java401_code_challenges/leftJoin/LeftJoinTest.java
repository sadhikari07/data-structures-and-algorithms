package java401_code_challenges.leftJoin;

import com.sun.source.tree.AssertTree;
import java401_code_challenges.hashtable.HashTable;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testRegularRLeftJoin() {
        LeftJoin classUnderTest = new LeftJoin();

        HashTable synonym = new HashTable();
        synonym.add("Hello", "hi");
        synonym.add("Home", "house");

        HashTable antonym = new HashTable();
        antonym.add("Hello", "bye");
        antonym.add("Home", "no home");

        ArrayList arr = classUnderTest.leftJoiner(synonym, antonym);

        assertEquals("There should be just two items in the hashtable.", 2, arr.size());
    }

    @Test
    public void testLeftJoinWithNoItemsOnRight() {
        LeftJoin classUnderTest = new LeftJoin();

        HashTable synonym = new HashTable();
        synonym.add("Hello", "hi");
        synonym.add("Home", "house");

        HashTable antonym = new HashTable();

        ArrayList arr = classUnderTest.leftJoiner(synonym, antonym);

        assertEquals("There should be just two items in the hashtable.", 2, arr.size());
    }

    @Test
    public void testLeftJoinItems() {
        LeftJoin classUnderTest = new LeftJoin();
        HashTable synonym = new HashTable();

        synonym.add("Hello", "hi");
        synonym.add("Home", "house");


        HashTable antonym = new HashTable();
        antonym.add("Hello", "bye");

        ArrayList arr = classUnderTest.leftJoiner(synonym, antonym);
        String[][] expectedOutput = {{"Hello", "hi", "bye"}, {"Home", "house", "Null"}};

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals("Expexted output must be equal to actual output", ((String[]) arr.get(i))[j], expectedOutput[i][j]);
            }
        }
    }

    @Test
    public void testLeftJoinItemsWithNothingOnRight() {
        LeftJoin classUnderTest = new LeftJoin();
        HashTable synonym = new HashTable();

        synonym.add("Hello", "hi");
        synonym.add("Home", "house");

        HashTable antonym = new HashTable();

        ArrayList arr = classUnderTest.leftJoiner(synonym, antonym);
        String[][] expectedOutput = {{"Hello", "hi", "Null"}, {"Home", "house", "Null"}};

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals("Expexted output must be equal to actual output", ((String[]) arr.get(i))[j], expectedOutput[i][j]);
            }
        }
    }

    @Test
    public void testLeftJoinItemsWithNothingOnBoth() {
        LeftJoin classUnderTest = new LeftJoin();
        HashTable synonym = new HashTable();

        HashTable antonym = new HashTable();

        ArrayList arr = classUnderTest.leftJoiner(synonym, antonym);
        String[][] expectedOutput = {};

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals("Expexted output must be equal to actual output", ((String[]) arr.get(i))[j], expectedOutput[i][j]);
            }
        }
    }

}