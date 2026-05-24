package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class LinearInTest {
    /**
     * < Q2 >
     * Tests the linearIn method.
     */
    @Test
    public void testLinearIn() {
        assertTrue(LinearIn.linearIn(
            new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        assertFalse(LinearIn.linearIn(
            new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        assertTrue(LinearIn.linearIn(
            new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
        assertTrue(LinearIn.linearIn(
            new int[]{2, 2, 4, 4, 6, 6}, new int[]{2, 4}));
        assertTrue(LinearIn.linearIn(
            new int[]{2, 2, 2, 2, 2}, new int[]{2, 2}));
        assertFalse(LinearIn.linearIn(
            new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}));
        assertTrue(LinearIn.linearIn(
            new int[]{2, 2, 2, 2, 4}, new int[]{2, 4}));
        assertTrue(LinearIn.linearIn(
            new int[]{1, 2, 3}, new int[]{2}));
        assertFalse(LinearIn.linearIn(
            new int[]{1, 2, 3}, new int[]{-1}));
        assertTrue(LinearIn.linearIn(
            new int[]{1, 2, 3}, new int[]{}));
        assertTrue(LinearIn.linearIn(
            new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}));
        assertFalse(LinearIn.linearIn(
            new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{0, 3, 12, 14}));
        assertFalse(LinearIn.linearIn(
            new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 10, 11}));
    }
}
