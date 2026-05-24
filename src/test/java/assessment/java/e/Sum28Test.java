package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Sum28Test {
    /**
     * < Q10 >
     * Tests the sum28 method.
     */
    @Test
    public void testSum28() {
        assertTrue(Sum28.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        assertFalse(Sum28.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        assertFalse(Sum28.sum28(new int[]{1, 2, 3, 4}));
        assertTrue(Sum28.sum28(new int[]{2, 2, 2, 2}));
        assertTrue(Sum28.sum28(new int[]{1, 2, 2, 2, 2, 4}));
        assertFalse(Sum28.sum28(new int[]{}));
        assertFalse(Sum28.sum28(new int[]{2}));
        assertFalse(Sum28.sum28(new int[]{8}));
        assertFalse(Sum28.sum28(new int[]{2, 2, 2}));
        assertFalse(Sum28.sum28(new int[]{2, 2, 2, 2, 2}));
        assertTrue(Sum28.sum28(new int[]{1, 2, 2, 1, 2, 2}));
        assertTrue(Sum28.sum28(new int[]{5, 2, 2, 2, 4, 2}));
    }
}
