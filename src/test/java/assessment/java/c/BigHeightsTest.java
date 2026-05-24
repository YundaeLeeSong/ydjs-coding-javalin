package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class BigHeightsTest {
    /**
     * < Q8 >
     * Tests the bigHeights method.
     */
    @Test
    public void testBigHeights() {
        assertEquals(1, BigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(0, BigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(1, BigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
        assertEquals(0, BigHeights.bigHeights(new int[]{5, 3, 6, 7, 3}, 0, 4));
        assertEquals(0, BigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 1, 1));
        assertEquals(1, BigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 2));
        assertEquals(2, BigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 2));
        assertEquals(2, BigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 4));
        assertEquals(3, BigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 4));
        assertEquals(2, BigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 3));
        assertEquals(0, BigHeights.bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
        assertEquals(1, BigHeights.bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
        assertEquals(1, BigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3));
        assertEquals(1, BigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8));
        assertEquals(2, BigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8));
        assertEquals(3, BigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8));
    }
}
