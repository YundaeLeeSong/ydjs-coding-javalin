package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SplitOdd10Test {
    /**
     * < Q11 >
     * Tests the splitOdd10 method.
     */
    @Test
    public void testSplitOdd10() {
        assertTrue(SplitOdd10.splitOdd10(new int[]{5, 5, 5}));
        assertFalse(SplitOdd10.splitOdd10(new int[]{5, 5, 6}));
        assertTrue(SplitOdd10.splitOdd10(new int[]{5, 5, 6, 1}));
        assertTrue(SplitOdd10.splitOdd10(new int[]{6, 5, 5, 1}));
        assertTrue(SplitOdd10.splitOdd10(new int[]{6, 5, 5, 1, 10}));
        assertFalse(SplitOdd10.splitOdd10(new int[]{6, 5, 5, 5, 1}));
        assertTrue(SplitOdd10.splitOdd10(new int[]{1}));
        assertFalse(SplitOdd10.splitOdd10(new int[]{}));
        assertTrue(SplitOdd10.splitOdd10(new int[]{10, 7, 5, 5}));
        assertFalse(SplitOdd10.splitOdd10(new int[]{10, 0, 5, 5}));
        assertTrue(SplitOdd10.splitOdd10(new int[]{10, 7, 5, 5, 2}));
        assertFalse(SplitOdd10.splitOdd10(new int[]{10, 7, 5, 5, 1}));
    }
}


