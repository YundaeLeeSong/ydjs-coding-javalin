package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class FizzArray3Test {
    /**
     * < Q10 >
     * Tests the fizzArray3 method.
     */
    @Test
    public void testFizzArray3() {
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, FizzArray3.fizzArray3(5, 10));
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, FizzArray3.fizzArray3(11, 18));
        assertArrayEquals(new int[]{1, 2}, FizzArray3.fizzArray3(1, 3));
        assertArrayEquals(new int[]{1}, FizzArray3.fizzArray3(1, 2));
        assertArrayEquals(new int[]{}, FizzArray3.fizzArray3(1, 1));
        assertArrayEquals(new int[]{1000, 1001, 1002, 1003, 1004}, FizzArray3.fizzArray3(1000, 1005));
    }
}
