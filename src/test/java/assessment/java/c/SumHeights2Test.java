package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SumHeights2Test {
    /**
     * < Q7 >
     * Tests the sumHeights2 method.
     */
    @Test
    public void testSumHeights2() {
        assertEquals(7, SumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, SumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(15, SumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4));
        assertEquals(0, SumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 1, 1));
        assertEquals(6, SumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
        assertEquals(19, SumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
        assertEquals(16, SumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8));
        assertEquals(0, SumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8));
        assertEquals(0, SumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2));
        assertEquals(4, SumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6));
        assertEquals(1, SumHeights2.sumHeights2(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 4));
        assertEquals(2, SumHeights2.sumHeights2(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 5));
    }
}
