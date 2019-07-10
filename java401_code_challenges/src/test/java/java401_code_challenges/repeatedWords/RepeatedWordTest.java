package java401_code_challenges.repeatedWords;


import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    @Test
    public void testRegularRepeatedWord() {
       RepeatedWord classUnderTest = new RepeatedWord();
       String output = classUnderTest.firstRepeatedWord("hello hi hello how are you");
       assertEquals("First repeated word should be hello.", "hello", output);
    }

    @Test
    public void testNoRepeatedWord() {
        RepeatedWord classUnderTest = new RepeatedWord();
        String output = classUnderTest.firstRepeatedWord("hello hi how are you");
        assertNull("No repeated words should return null.", output);
    }

    @Test
    public void testRegularRepeatedWordWithFullStop() {
        RepeatedWord classUnderTest = new RepeatedWord();
        String output = classUnderTest.firstRepeatedWord("hello. hi hello how are you");
        assertEquals("First repeated word should be hello.", "hello", output);
    }

    @Test
    public void testRegularRepeatedWordWithComma() {
        RepeatedWord classUnderTest = new RepeatedWord();
        String output = classUnderTest.firstRepeatedWord("hello, hi hello how are you");
        assertEquals("First repeated word should be hello.", "hello", output);
    }

    @Test
    public void testRegularRepeatedWordWithMultipleSpaces() {
        RepeatedWord classUnderTest = new RepeatedWord();
        String output = classUnderTest.firstRepeatedWord("hello  hi hello how are you");
        assertEquals("First repeated word should be hello.", "hello", output);
    }

    @Test
    public void testRegularRepeatedWordWithLongString() {
        RepeatedWord classUnderTest = new RepeatedWord();
        String output = classUnderTest.firstRepeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...");
        assertEquals("First repeated word should be it.", "it", output);
    }

    @Test
    public void testRegularRepeatedWordWithEmptyString() {
        RepeatedWord classUnderTest = new RepeatedWord();
        String output = classUnderTest.firstRepeatedWord("");
         assertNull("Empty string should return null", output);
    }

}