package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Array6Test {
    /**
     * < Q13 >
     * Tests the array6 method.
     */
    @Test
    public void testArray6() {
        assertTrue(Array6.array6(new int[]{1, 6, 4}, 0));
        assertFalse(Array6.array6(new int[]{1, 4}, 0));
        assertTrue(Array6.array6(new int[]{6}, 0));
        assertFalse(Array6.array6(new int[]{}, 0));
        assertTrue(Array6.array6(new int[]{6, 2, 2}, 0));
        assertFalse(Array6.array6(new int[]{2, 5}, 0));
        assertTrue(Array6.array6(new int[]{1, 9, 4, 6, 6}, 0));
        assertTrue(Array6.array6(new int[]{2, 5, 6}, 0));
    }
}
