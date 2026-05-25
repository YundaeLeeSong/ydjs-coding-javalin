package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SumDigitsTest {
    /**
     * < Q12 >
     * Tests the sumDigits method.
     */
    @Test
    public void testSumDigits() {
        assertEquals(9, SumDigits.sumDigits(126));
        assertEquals(13, SumDigits.sumDigits(49));
        assertEquals(3, SumDigits.sumDigits(12));
        assertEquals(1, SumDigits.sumDigits(10));
        assertEquals(1, SumDigits.sumDigits(1));
        assertEquals(0, SumDigits.sumDigits(0));
        assertEquals(10, SumDigits.sumDigits(730));
        assertEquals(4, SumDigits.sumDigits(1111));
        assertEquals(5, SumDigits.sumDigits(11111));
        assertEquals(3, SumDigits.sumDigits(10110));
        assertEquals(10, SumDigits.sumDigits(235));
    }
}


