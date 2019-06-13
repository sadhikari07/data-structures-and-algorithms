package java401_code_challenges.multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testJustTwoCurlies() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue("Opening and closing curly brackets are valid.", classUnderTest.checkIfBracketsAreBalanced("{}"));
    }

    @Test
    public void testThreeSetsOfBrackets() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue("Different valid sets of brackets should return true.", classUnderTest.checkIfBracketsAreBalanced("{}(){}"));
    }

    @Test
    public void testBracketsWithText() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue("Valid brackets with text should return true.", classUnderTest.checkIfBracketsAreBalanced("()[[Extra Characters]]"));
    }

    @Test
    public void testBracketsWithCombo() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue("Valid bracket combination should return true", classUnderTest.checkIfBracketsAreBalanced("(){}[[]]"));
    }

    @Test
    public void testOneMissingParenthesis() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertFalse("Invalid combo should return false.", classUnderTest.checkIfBracketsAreBalanced("[({}]"));
    }

    @Test
    public void testJustComboAndText() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertTrue("Valid bracket combination should return true.", classUnderTest.checkIfBracketsAreBalanced("{}{Code}[Fellows](())"));
    }

    @Test
    public void testMismatch() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertFalse("Invalid combo should return false.", classUnderTest.checkIfBracketsAreBalanced("(]("));
    }

    @Test
    public void testInvalidPlacement() {
        MultiBracketValidation classUnderTest = new MultiBracketValidation();
        assertFalse("nvalid combo should return false.", classUnderTest.checkIfBracketsAreBalanced("{(})"));
    }

}