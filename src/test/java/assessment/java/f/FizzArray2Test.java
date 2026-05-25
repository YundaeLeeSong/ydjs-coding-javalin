package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class FizzArray2Test {
    /**
     * < Q9 >
     * Tests the fizzArray2 method.
     */
    @Test
    public void testFizzArray2() {
        assertArrayEquals(new String[]{"0", "1", "2", "3"}, 
            FizzArray2.fizzArray2(4));
        assertArrayEquals(
            new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, 
            FizzArray2.fizzArray2(10));
        assertArrayEquals(new String[]{"0", "1"}, FizzArray2.fizzArray2(2));
        assertArrayEquals(new String[]{"0"}, FizzArray2.fizzArray2(1));
        assertArrayEquals(new String[]{}, FizzArray2.fizzArray2(0));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6"}, 
            FizzArray2.fizzArray2(7));
        assertArrayEquals(
            new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"}, 
            FizzArray2.fizzArray2(9));
        assertArrayEquals(
            new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
                         "10"}, 
            FizzArray2.fizzArray2(11));
    }
}


