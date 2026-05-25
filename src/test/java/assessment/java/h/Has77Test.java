package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Has77Test {
    /**
     * < Q5 >
     * Tests the has77 method.
     */
    @Test
    public void testHas77() {
        assertTrue(Has77.has77(new int[]{1, 7, 7}));
        assertTrue(Has77.has77(new int[]{1, 7, 1, 7}));
        assertFalse(Has77.has77(new int[]{1, 7, 1, 1, 7}));
        assertTrue(Has77.has77(new int[]{7, 7, 1, 1, 7}));
        assertFalse(Has77.has77(new int[]{2, 7, 2, 2, 7, 2}));
        assertTrue(Has77.has77(new int[]{2, 7, 2, 2, 7, 7}));
        assertTrue(Has77.has77(new int[]{7, 2, 7, 2, 2, 7}));
        assertFalse(Has77.has77(new int[]{7, 2, 6, 2, 2, 7}));
        assertTrue(Has77.has77(new int[]{7, 7, 7}));
        assertTrue(Has77.has77(new int[]{7, 1, 7}));
        assertFalse(Has77.has77(new int[]{7, 1, 1}));
        assertFalse(Has77.has77(new int[]{1, 2}));
        assertFalse(Has77.has77(new int[]{1, 7}));
        assertFalse(Has77.has77(new int[]{7}));
    }
}


