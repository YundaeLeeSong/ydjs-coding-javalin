package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class LuckySumTest {
    /**
     * < Q2 >
     * Tests the luckySum method.
     */
    @Test
    public void testLuckySum() {
        assertEquals(6, LuckySum.luckySum(1, 2, 3));
        assertEquals(3, LuckySum.luckySum(1, 2, 13));
        assertEquals(1, LuckySum.luckySum(1, 13, 3));
        assertEquals(1, LuckySum.luckySum(1, 13, 13));
        assertEquals(13, LuckySum.luckySum(6, 5, 2));
        assertEquals(0, LuckySum.luckySum(13, 2, 3));
        assertEquals(0, LuckySum.luckySum(13, 2, 13));
        assertEquals(0, LuckySum.luckySum(13, 13, 2));
        assertEquals(13, LuckySum.luckySum(9, 4, 13));
        assertEquals(8, LuckySum.luckySum(8, 13, 2));
        assertEquals(10, LuckySum.luckySum(7, 2, 1));
        assertEquals(6, LuckySum.luckySum(3, 3, 13));
    }
}
