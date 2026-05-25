package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class BigDiffTest {
    /**
     * < Q5 >
     * Tests the bigDiff method.
     */
    @Test
    public void testBigDiff() {
        assertEquals(7, BigDiff.bigDiff(new int[]{10, 3, 5, 6}));
        assertEquals(8, BigDiff.bigDiff(new int[]{7, 2, 10, 9}));
        assertEquals(8, BigDiff.bigDiff(new int[]{2, 10, 7, 2}));
        assertEquals(8, BigDiff.bigDiff(new int[]{2, 10}));
        assertEquals(8, BigDiff.bigDiff(new int[]{10, 2}));
        assertEquals(10, BigDiff.bigDiff(new int[]{10, 0}));
        assertEquals(1, BigDiff.bigDiff(new int[]{2, 3}));
        assertEquals(0, BigDiff.bigDiff(new int[]{2, 2}));
        assertEquals(0, BigDiff.bigDiff(new int[]{2}));
        assertEquals(8, BigDiff.bigDiff(new int[]{5, 1, 6, 1, 9, 9}));
        assertEquals(3, BigDiff.bigDiff(new int[]{7, 6, 8, 5}));
        assertEquals(3, BigDiff.bigDiff(new int[]{7, 7, 6, 8, 5, 5, 6}));
    }
}


