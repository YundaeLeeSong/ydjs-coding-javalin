package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class FizzArrayTest {
    /**
     * < Q7 >
     * Tests the fizzArray method.
     */
    @Test
    public void testFizzArray() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, FizzArray.fizzArray(4));
        assertArrayEquals(new int[]{0}, FizzArray.fizzArray(1));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 
            FizzArray.fizzArray(10));
        assertArrayEquals(new int[]{}, FizzArray.fizzArray(0));
        assertArrayEquals(new int[]{0, 1}, FizzArray.fizzArray(2));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6}, 
            FizzArray.fizzArray(7));
    }
}
