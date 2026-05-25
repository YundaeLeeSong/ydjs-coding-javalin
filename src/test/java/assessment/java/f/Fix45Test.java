package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Fix45Test {
    /**
     * < Q4 >
     * Tests the fix45 method.
     */
    @Test
    public void testFix45() {
        assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9}, 
            Fix45.fix45(new int[]{5, 4, 9, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1}, 
            Fix45.fix45(new int[]{1, 4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5}, 
            Fix45.fix45(new int[]{1, 4, 1, 5, 5, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 9, 9, 4, 5, 9}, 
            Fix45.fix45(new int[]{4, 9, 4, 9, 5, 5, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 1, 4, 5, 4, 5}, 
            Fix45.fix45(new int[]{5, 5, 4, 1, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 2, 2}, 
            Fix45.fix45(new int[]{4, 2, 2, 5}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 2, 2}, 
            Fix45.fix45(new int[]{4, 2, 4, 2, 5, 5}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 2}, 
            Fix45.fix45(new int[]{4, 2, 4, 5, 5}));
        assertArrayEquals(new int[]{1, 1, 1}, 
            Fix45.fix45(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{4, 5}, 
            Fix45.fix45(new int[]{4, 5}));
        assertArrayEquals(new int[]{1, 4, 5}, 
            Fix45.fix45(new int[]{5, 4, 1}));
        assertArrayEquals(new int[]{}, 
            Fix45.fix45(new int[]{}));
        assertArrayEquals(new int[]{1, 4, 5, 4, 5}, 
            Fix45.fix45(new int[]{5, 4, 5, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 1}, 
            Fix45.fix45(new int[]{4, 5, 4, 1, 5}));
        assertArrayEquals(new int[]{3, 4, 5}, 
            Fix45.fix45(new int[]{3, 4, 5}));
        assertArrayEquals(new int[]{4, 5, 1}, 
            Fix45.fix45(new int[]{4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5}, 
            Fix45.fix45(new int[]{5, 4, 1}));
        assertArrayEquals(new int[]{2, 4, 5, 2}, 
            Fix45.fix45(new int[]{2, 4, 2, 5}));
    }
}


