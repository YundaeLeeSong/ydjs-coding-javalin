package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Lucky13Test {
    /**
     * < Q9 >
     * Tests the lucky13 method.
     */
    @Test
    public void testLucky13() {
        assertTrue(Lucky13.lucky13(new int[]{0, 2, 4}));
        assertFalse(Lucky13.lucky13(new int[]{1, 2, 3}));
        assertFalse(Lucky13.lucky13(new int[]{1, 2, 4}));
        assertTrue(Lucky13.lucky13(new int[]{2, 7, 2, 8}));
        assertFalse(Lucky13.lucky13(new int[]{2, 7, 1, 8}));
        assertFalse(Lucky13.lucky13(new int[]{3, 7, 2, 8}));
        assertFalse(Lucky13.lucky13(new int[]{2, 7, 2, 1}));
        assertFalse(Lucky13.lucky13(new int[]{1, 2}));
        assertTrue(Lucky13.lucky13(new int[]{2, 2}));
        assertTrue(Lucky13.lucky13(new int[]{2}));
        assertFalse(Lucky13.lucky13(new int[]{3}));
        assertTrue(Lucky13.lucky13(new int[]{}));
    }
}
