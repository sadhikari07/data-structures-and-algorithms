package array_shift;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testinsertShiftArrayEven() {
    ArrayShift libraryForTesting = new ArrayShift();
    int[] oldArray = new int[]{1,2,3,4};
    int inputInt = 10;
    int[] expectedOutput = new int[] {1, 2,10, 3, 4};
    assertArrayEquals("Inserting and shifting item in an array", expectedOutput, libraryForTesting.insertShiftArray(oldArray, inputInt));
}
    @Test
    public void testinsertShiftArrayOdd(){
        ArrayShift libraryForTesting = new ArrayShift();
        int[] oldArray = new int[]{1,2,3,4,5};
        int inputInt = 15;
        int[] expectedOutput = new int[] {1, 2, 3, 15, 4, 5};
        assertArrayEquals("Inserting and shifting item in an array", expectedOutput, libraryForTesting.insertShiftArray(oldArray, inputInt));
    }
}

//Some further tests if time had permitted:
//test for an empty array
//test for an array with just one element on it
//test with negative number as input integer.

