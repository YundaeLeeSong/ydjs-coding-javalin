package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SumHeightsTest {
    /**
     * < Q6 >
     * Tests the sumHeights method.
     */
    @Test
    public void testSumHeights() {
        assertEquals(6, SumHeights.sumHeights(
            new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, SumHeights.sumHeights(
            new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(11, SumHeights.sumHeights(
            new int[]{5, 3, 6, 7, 2}, 0, 4));
        assertEquals(0, SumHeights.sumHeights(
            new int[]{5, 3, 6, 7, 2}, 1, 1));
        assertEquals(3, SumHeights.sumHeights(
            new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
    }
}
