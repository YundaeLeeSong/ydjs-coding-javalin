package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CenteredAverageTest {
    /**
     * < Q6 >
     * Tests the centeredAverage method.
     */
    @Test
    public void testCenteredAverage() {
        assertEquals(3, CenteredAverage.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        assertEquals(5, CenteredAverage.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        assertEquals(-3, CenteredAverage.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
        assertEquals(4, CenteredAverage.centeredAverage(new int[]{5, 3, 4, 6, 2}));
        assertEquals(4, CenteredAverage.centeredAverage(new int[]{5, 3, 4, 0, 100}));
        assertEquals(4, CenteredAverage.centeredAverage(new int[]{100, 0, 5, 3, 4}));
        assertEquals(4, CenteredAverage.centeredAverage(new int[]{4, 0, 100}));
        assertEquals(3, CenteredAverage.centeredAverage(new int[]{0, 2, 3, 4, 100}));
        assertEquals(1, CenteredAverage.centeredAverage(new int[]{1, 1, 100}));
        assertEquals(7, CenteredAverage.centeredAverage(new int[]{7, 7, 7}));
        assertEquals(7, CenteredAverage.centeredAverage(new int[]{1, 7, 8}));
        assertEquals(50, CenteredAverage.centeredAverage(new int[]{1, 1, 99, 99}));
        assertEquals(50, CenteredAverage.centeredAverage(new int[]{1000, 0, 1, 99}));
        assertEquals(4, CenteredAverage.centeredAverage(new int[]{4, 4, 4, 4, 5}));
        assertEquals(4, CenteredAverage.centeredAverage(new int[]{4, 4, 4, 1, 5}));
        assertEquals(6, CenteredAverage.centeredAverage(new int[]{6, 4, 8, 12, 3}));
    }
}
