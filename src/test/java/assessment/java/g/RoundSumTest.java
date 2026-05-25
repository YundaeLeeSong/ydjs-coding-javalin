package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class RoundSumTest {
    /**
     * < Q9 >
     * Tests the roundSum method.
     */
    @Test
    public void testRoundSum() {
        assertEquals(60, RoundSum.roundSum(16, 17, 18));
        assertEquals(30, RoundSum.roundSum(12, 13, 14));
        assertEquals(10, RoundSum.roundSum(6, 4, 4));
        assertEquals(20, RoundSum.roundSum(4, 6, 5));
        assertEquals(10, RoundSum.roundSum(4, 4, 6));
        assertEquals(10, RoundSum.roundSum(9, 4, 4));
        assertEquals(0, RoundSum.roundSum(0, 0, 1));
        assertEquals(10, RoundSum.roundSum(0, 9, 0));
        assertEquals(40, RoundSum.roundSum(10, 10, 19));
        assertEquals(90, RoundSum.roundSum(20, 30, 40));
        assertEquals(100, RoundSum.roundSum(45, 21, 30));
        assertEquals(60, RoundSum.roundSum(23, 11, 26));
        assertEquals(70, RoundSum.roundSum(23, 24, 25));
        assertEquals(80, RoundSum.roundSum(25, 24, 25));
        assertEquals(70, RoundSum.roundSum(23, 24, 29));
        assertEquals(70, RoundSum.roundSum(11, 24, 36));
        assertEquals(90, RoundSum.roundSum(24, 36, 32));
        assertEquals(50, RoundSum.roundSum(14, 12, 26));
        assertEquals(40, RoundSum.roundSum(12, 10, 24));
    }
}


