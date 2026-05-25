package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Sum13Test {
    /**
     * < Q2 >
     * Tests the sum13 method.
     */
    @Test
    public void testSum13() {
        assertEquals(6, Sum13.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, Sum13.sum13(new int[]{1, 1}));
        assertEquals(6, Sum13.sum13(new int[]{1, 2, 2, 1, 13}));
        assertEquals(4, Sum13.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        assertEquals(3, Sum13.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
        assertEquals(0, Sum13.sum13(new int[]{}));
        assertEquals(0, Sum13.sum13(new int[]{13}));
        assertEquals(0, Sum13.sum13(new int[]{13, 13}));
        assertEquals(0, Sum13.sum13(new int[]{13, 0, 13}));
        assertEquals(0, Sum13.sum13(new int[]{13, 1, 13}));
        assertEquals(14, Sum13.sum13(new int[]{5, 7, 2}));
        assertEquals(5, Sum13.sum13(new int[]{5, 13, 2}));
        assertEquals(0, Sum13.sum13(new int[]{0}));
        assertEquals(0, Sum13.sum13(new int[]{13, 0}));
    }
}


