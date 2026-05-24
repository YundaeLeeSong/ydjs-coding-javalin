package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Has22Test {
    /**
     * < Q3 >
     * Tests the has22 method.
     */
    @Test
    public void testHas22() {
        assertTrue(Has22.has22(new int[]{1, 2, 2}));
        assertFalse(Has22.has22(new int[]{1, 2, 1, 2}));
        assertFalse(Has22.has22(new int[]{2, 1, 2}));
        assertTrue(Has22.has22(new int[]{2, 2, 1, 2}));
        assertFalse(Has22.has22(new int[]{1, 3, 2}));
        assertTrue(Has22.has22(new int[]{1, 3, 2, 2}));
        assertTrue(Has22.has22(new int[]{2, 3, 2, 2}));
        assertTrue(Has22.has22(new int[]{4, 2, 4, 2, 2, 5}));
        assertFalse(Has22.has22(new int[]{1, 2}));
        assertTrue(Has22.has22(new int[]{2, 2}));
        assertFalse(Has22.has22(new int[]{2}));
        assertFalse(Has22.has22(new int[]{}));
        assertTrue(Has22.has22(new int[]{3, 3, 2, 2}));
        assertFalse(Has22.has22(new int[]{5, 2, 5, 2}));
    }
}
