package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SeriesUpTest {
    /**
     * < Q6 >
     * Tests the seriesUp method.
     */
    @Test
    public void testSeriesUp() {
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3}, SeriesUp.seriesUp(3));
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}, SeriesUp.seriesUp(4));
        assertArrayEquals(new int[]{1, 1, 2}, SeriesUp.seriesUp(2));
        assertArrayEquals(new int[]{1}, SeriesUp.seriesUp(1));
        assertArrayEquals(new int[]{}, SeriesUp.seriesUp(0));
        assertArrayEquals(new int[]{
            1, 1, 2, 1, 2, 3, 1, 2, 3, 4,
            1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6
        }, SeriesUp.seriesUp(6));
    }
}
