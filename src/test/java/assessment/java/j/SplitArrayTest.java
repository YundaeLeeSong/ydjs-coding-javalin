package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SplitArrayTest {
    /**
     * < Q14 >
     * Tests the splitArray method.
     */
    @Test
    public void testSplitArray() {
        assertTrue(SplitArray.splitArray(new int[]{2, 2}));
        assertFalse(SplitArray.splitArray(new int[]{2, 3}));
        assertTrue(SplitArray.splitArray(new int[]{5, 2, 3}));
        assertFalse(SplitArray.splitArray(new int[]{5, 2, 2}));
        assertTrue(SplitArray.splitArray(new int[]{1, 1, 1, 1, 1, 1}));
        assertFalse(SplitArray.splitArray(new int[]{1, 1, 1, 1, 1}));
        assertTrue(SplitArray.splitArray(new int[]{}));
        assertFalse(SplitArray.splitArray(new int[]{1}));
        assertFalse(SplitArray.splitArray(new int[]{3, 5}));
        assertTrue(SplitArray.splitArray(new int[]{5, 3, 2}));
        assertTrue(SplitArray.splitArray(new int[]{2, 2, 10, 10, 1, 1}));
        assertFalse(SplitArray.splitArray(new int[]{1, 2, 2, 10, 10, 1, 1}));
        assertTrue(SplitArray.splitArray(new int[]{1, 2, 3, 10, 10, 1, 1}));
    }
}
