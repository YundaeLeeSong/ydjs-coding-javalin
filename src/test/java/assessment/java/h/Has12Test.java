package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Has12Test {
    /**
     * < Q6 >
     * Tests the has12 method.
     */
    @Test
    public void testHas12() {
        assertTrue(Has12.has12(new int[]{1, 3, 2}));
        assertTrue(Has12.has12(new int[]{3, 1, 2}));
        assertTrue(Has12.has12(new int[]{3, 1, 4, 5, 2}));
        assertFalse(Has12.has12(new int[]{3, 1, 4, 5, 6}));
        assertTrue(Has12.has12(new int[]{3, 1, 4, 1, 6, 2}));
        assertTrue(Has12.has12(new int[]{2, 1, 4, 1, 6, 2}));
        assertFalse(Has12.has12(new int[]{2, 1, 4, 1, 6}));
        assertFalse(Has12.has12(new int[]{1}));
        assertFalse(Has12.has12(new int[]{2, 1, 3}));
        assertTrue(Has12.has12(new int[]{2, 1, 3, 2}));
        assertFalse(Has12.has12(new int[]{2}));
        assertFalse(Has12.has12(new int[]{3, 2}));
        assertTrue(Has12.has12(new int[]{3, 1, 3, 2}));
        assertFalse(Has12.has12(new int[]{3, 5, 9}));
        assertFalse(Has12.has12(new int[]{3, 5, 1}));
        assertFalse(Has12.has12(new int[]{3, 2, 1}));
        assertTrue(Has12.has12(new int[]{1, 2}));
    }
}
