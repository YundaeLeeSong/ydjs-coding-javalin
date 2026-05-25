package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MaxSpanTest {
    /**
     * < Q9 >
     * Tests the maxSpan method.
     */
    @Test
    public void testMaxSpan() {
        assertEquals(4, MaxSpan.maxSpan(new int[]{1, 2, 1, 1, 3}));
        assertEquals(6, MaxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, MaxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        assertEquals(3, MaxSpan.maxSpan(new int[]{3, 3, 3}));
        assertEquals(3, MaxSpan.maxSpan(new int[]{3, 9, 3}));
        assertEquals(2, MaxSpan.maxSpan(new int[]{3, 9, 9}));
        assertEquals(1, MaxSpan.maxSpan(new int[]{3, 9}));
        assertEquals(2, MaxSpan.maxSpan(new int[]{3, 3}));
        assertEquals(0, MaxSpan.maxSpan(new int[]{}));
        assertEquals(1, MaxSpan.maxSpan(new int[]{1}));
    }
}


