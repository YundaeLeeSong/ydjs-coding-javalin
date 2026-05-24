package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Fix34Test {
    /**
     * < Q6 >
     * Tests the fix34 method.
     */
    @Test
    public void testFix34() {
        assertArrayEquals(new int[]{1, 3, 4, 1}, Fix34.fix34(new int[]{1, 3, 1, 4}));
        assertArrayEquals(new int[]{1, 3, 4, 1, 1, 3, 4}, Fix34.fix34(new int[]{1, 3, 1, 4, 4, 3, 1}));
        assertArrayEquals(new int[]{3, 4, 2, 2}, Fix34.fix34(new int[]{3, 2, 2, 4}));
        assertArrayEquals(new int[]{3, 4, 3, 4, 2, 2}, Fix34.fix34(new int[]{3, 2, 3, 2, 4, 4}));
        assertArrayEquals(new int[]{2, 3, 4, 3, 4, 2, 2}, Fix34.fix34(new int[]{2, 3, 2, 3, 2, 4, 4}));
        assertArrayEquals(new int[]{5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4}, Fix34.fix34(new int[]{5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5}));
        assertArrayEquals(new int[]{3, 4, 1}, Fix34.fix34(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{3, 4, 1}, Fix34.fix34(new int[]{3, 4, 1}));
        assertArrayEquals(new int[]{1, 1, 1}, Fix34.fix34(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{1}, Fix34.fix34(new int[]{1}));
        assertArrayEquals(new int[]{}, Fix34.fix34(new int[]{}));
        assertArrayEquals(new int[]{7, 3, 4, 7, 7}, Fix34.fix34(new int[]{7, 3, 7, 7, 4}));
        assertArrayEquals(new int[]{3, 4, 1, 3, 4, 1}, Fix34.fix34(new int[]{3, 1, 4, 3, 1, 4}));
        assertArrayEquals(new int[]{3, 4, 1, 3, 4, 1}, Fix34.fix34(new int[]{3, 1, 1, 3, 4, 4}));
    }
}
