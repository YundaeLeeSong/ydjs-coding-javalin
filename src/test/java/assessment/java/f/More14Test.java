package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class More14Test {
    /**
     * < Q1 >
     * Tests the more14 method.
     */
    @Test
    public void testMore14() {
        assertTrue(More14.more14(new int[]{1, 4, 1}));
        assertFalse(More14.more14(new int[]{1, 4, 1, 4}));
        assertTrue(More14.more14(new int[]{1, 1}));
        assertTrue(More14.more14(new int[]{1, 6, 6}));
        assertTrue(More14.more14(new int[]{1}));
        assertFalse(More14.more14(new int[]{1, 4}));
        assertTrue(More14.more14(new int[]{6, 1, 1}));
        assertFalse(More14.more14(new int[]{1, 6, 4}));
        assertTrue(More14.more14(new int[]{1, 1, 4, 4, 1}));
        assertTrue(More14.more14(new int[]{1, 1, 6, 4, 4, 1}));
        assertFalse(More14.more14(new int[]{}));
        assertFalse(More14.more14(new int[]{4, 1, 4, 6}));
        assertFalse(More14.more14(new int[]{4, 1, 4, 6, 1}));
        assertTrue(More14.more14(new int[]{1, 4, 1, 4, 1, 6}));
    }
}
