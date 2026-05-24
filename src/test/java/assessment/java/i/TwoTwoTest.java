package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class TwoTwoTest {
    /**
     * < Q7 >
     * Tests the twoTwo method.
     */
    @Test
    public void testTwoTwo() {
        assertTrue(TwoTwo.twoTwo(new int[]{4, 2, 2, 3}));
        assertTrue(TwoTwo.twoTwo(new int[]{2, 2, 4}));
        assertFalse(TwoTwo.twoTwo(new int[]{2, 2, 4, 2}));
        assertTrue(TwoTwo.twoTwo(new int[]{1, 3, 4}));
        assertTrue(TwoTwo.twoTwo(new int[]{1, 2, 2, 3, 4}));
        assertFalse(TwoTwo.twoTwo(new int[]{1, 2, 3, 4}));
        assertTrue(TwoTwo.twoTwo(new int[]{2, 2}));
        assertTrue(TwoTwo.twoTwo(new int[]{2, 2, 7}));
        assertFalse(TwoTwo.twoTwo(new int[]{2, 2, 7, 2, 1}));
        assertTrue(TwoTwo.twoTwo(new int[]{4, 2, 2, 2}));
        assertTrue(TwoTwo.twoTwo(new int[]{2, 2, 2}));
        assertFalse(TwoTwo.twoTwo(new int[]{1, 2}));
        assertFalse(TwoTwo.twoTwo(new int[]{2}));
        assertTrue(TwoTwo.twoTwo(new int[]{1}));
        assertTrue(TwoTwo.twoTwo(new int[]{}));
        assertTrue(TwoTwo.twoTwo(new int[]{5, 2, 2, 3}));
        assertFalse(TwoTwo.twoTwo(new int[]{2, 2, 5, 2}));
    }
}
