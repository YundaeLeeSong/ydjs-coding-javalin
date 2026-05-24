package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class EvenOddTest {
    /**
     * < Q8 >
     * Tests the evenOdd method.
     */
    @Test
    public void testEvenOdd() {
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 1}, EvenOdd.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 3}, EvenOdd.evenOdd(new int[]{3, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, EvenOdd.evenOdd(new int[]{2, 2, 2}));
        assertArrayEquals(new int[]{2, 2, 3}, EvenOdd.evenOdd(new int[]{3, 2, 2}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, EvenOdd.evenOdd(new int[]{1, 1, 0, 1, 0}));
        assertArrayEquals(new int[]{1}, EvenOdd.evenOdd(new int[]{1}));
        assertArrayEquals(new int[]{2, 1}, EvenOdd.evenOdd(new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 1}, EvenOdd.evenOdd(new int[]{2, 1}));
        assertArrayEquals(new int[]{}, EvenOdd.evenOdd(new int[]{}));
    }
}
