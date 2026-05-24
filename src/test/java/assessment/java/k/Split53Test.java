package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Split53Test {
    /**
     * < Q12 >
     * Tests the split53 method.
     */
    @Test
    public void testSplit53() {
        assertTrue(Split53.split53(new int[]{1, 1}));
        assertFalse(Split53.split53(new int[]{1, 1, 1}));
        assertTrue(Split53.split53(new int[]{2, 4, 2}));
        assertFalse(Split53.split53(new int[]{2, 2, 2, 1}));
        assertTrue(Split53.split53(new int[]{3, 3, 5, 1}));
        assertFalse(Split53.split53(new int[]{3, 5, 8}));
        assertTrue(Split53.split53(new int[]{2, 4, 6}));
        assertTrue(Split53.split53(new int[]{3, 5, 6, 10, 3, 3}));
    }
}
