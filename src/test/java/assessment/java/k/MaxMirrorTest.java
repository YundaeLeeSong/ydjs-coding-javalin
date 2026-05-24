package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MaxMirrorTest {
    /**
     * < Q4 >
     * Tests the maxMirror method.
     */
    @Test
    public void testMaxMirror() {
        assertEquals(3, MaxMirror.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        assertEquals(3, MaxMirror.maxMirror(new int[]{1, 2, 1, 4}));
        assertEquals(2, MaxMirror.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
        assertEquals(4, MaxMirror.maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
        assertEquals(4, MaxMirror.maxMirror(new int[]{1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}));
        assertEquals(5, MaxMirror.maxMirror(new int[]{1, 2, 3, 2, 1}));
        assertEquals(2, MaxMirror.maxMirror(new int[]{1, 2, 3, 3, 8}));
        assertEquals(2, MaxMirror.maxMirror(new int[]{1, 2, 7, 8, 1, 7, 2}));
        assertEquals(3, MaxMirror.maxMirror(new int[]{1, 1, 1}));
        assertEquals(1, MaxMirror.maxMirror(new int[]{1}));
        assertEquals(0, MaxMirror.maxMirror(new int[]{}));
        assertEquals(3, MaxMirror.maxMirror(new int[]{9, 1, 1, 4, 2, 1, 1, 1}));
        assertEquals(7, MaxMirror.maxMirror(new int[]{5, 9, 9, 4, 5, 4, 9, 9, 2}));
        assertEquals(2, MaxMirror.maxMirror(new int[]{5, 9, 9, 6, 5, 4, 9, 9, 2}));
        assertEquals(3, MaxMirror.maxMirror(new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5}));
    }
}
