package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class No14Test {
    /**
     * < Q3 >
     * Tests the no14 method.
     */
    @Test
    public void testNo14() {
        assertTrue(No14.no14(new int[]{1, 2, 3}));
        assertFalse(No14.no14(new int[]{1, 2, 3, 4}));
        assertTrue(No14.no14(new int[]{2, 3, 4}));
        assertFalse(No14.no14(new int[]{1, 1, 4, 4}));
        assertTrue(No14.no14(new int[]{2, 2, 4, 4}));
        assertFalse(No14.no14(new int[]{2, 3, 4, 1}));
        assertTrue(No14.no14(new int[]{2, 1, 1}));
        assertFalse(No14.no14(new int[]{1, 4}));
        assertTrue(No14.no14(new int[]{2}));
        assertTrue(No14.no14(new int[]{2, 1}));
        assertTrue(No14.no14(new int[]{1}));
        assertTrue(No14.no14(new int[]{4}));
        assertTrue(No14.no14(new int[]{}));
        assertTrue(No14.no14(new int[]{1, 1, 1, 1}));
        assertFalse(No14.no14(new int[]{9, 4, 4, 1}));
        assertFalse(No14.no14(new int[]{4, 2, 3, 1}));
        assertTrue(No14.no14(new int[]{4, 2, 3, 5}));
        assertTrue(No14.no14(new int[]{4, 4, 2}));
        assertFalse(No14.no14(new int[]{1, 4, 4}));
    }
}
