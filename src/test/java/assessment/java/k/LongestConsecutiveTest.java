package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveTest {
    /**
     * < Q10 >
     * Tests the longestConsecutive method.
     */
    @Test
    public void testLongestConsecutive() {
        assertEquals(0, LongestConsecutive.longestConsecutive(new int[]{}));
        assertEquals(1, LongestConsecutive.longestConsecutive(new int[]{42}));
        assertEquals(4, 
            LongestConsecutive.longestConsecutive(new int[]{1, 2, 3, 4}));
        assertEquals(4, 
            LongestConsecutive.longestConsecutive(
                new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(5, 
            LongestConsecutive.longestConsecutive(
                new int[]{0, -1, 1, 2, -2, 5}));
        assertEquals(3, 
            LongestConsecutive.longestConsecutive(
                new int[]{1, 1, 2, 2, 3, 3}));
        assertEquals(3, 
            LongestConsecutive.longestConsecutive(
                new int[]{10, 5, 6, 7, 100}));
    }
}


