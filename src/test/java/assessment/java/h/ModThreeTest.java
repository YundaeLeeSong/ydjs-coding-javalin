package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ModThreeTest {
    /**
     * < Q7 >
     * Tests the modThree method.
     */
    @Test
    public void testModThree() {
        assertTrue(ModThree.modThree(new int[]{2, 1, 3, 5}));
        assertFalse(ModThree.modThree(new int[]{2, 1, 2, 5}));
        assertTrue(ModThree.modThree(new int[]{2, 4, 2, 5}));
        assertFalse(ModThree.modThree(new int[]{1, 2, 1, 2, 1}));
        assertTrue(ModThree.modThree(new int[]{9, 9, 9}));
        assertFalse(ModThree.modThree(new int[]{1, 2, 1}));
        assertFalse(ModThree.modThree(new int[]{1, 2}));
        assertFalse(ModThree.modThree(new int[]{1}));
        assertFalse(ModThree.modThree(new int[]{}));
        assertFalse(ModThree.modThree(new int[]{9, 7, 2, 9}));
        assertFalse(ModThree.modThree(new int[]{9, 7, 2, 9, 2, 2}));
        assertTrue(ModThree.modThree(new int[]{9, 7, 2, 9, 2, 2, 6}));
    }
}
