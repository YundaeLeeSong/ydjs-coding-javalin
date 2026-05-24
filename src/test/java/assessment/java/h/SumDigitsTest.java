package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SumDigitsTest {
    /**
     * < Q1 >
     * Tests the sumDigits method.
     */
    @Test
    public void testSumDigits() {
        assertEquals(6, SumDigits.sumDigits("aa1bc2d3"));
        assertEquals(8, SumDigits.sumDigits("aa11b33"));
        assertEquals(0, SumDigits.sumDigits("Chocolate"));
        assertEquals(7, SumDigits.sumDigits("5hoco1a1e"));
        assertEquals(12, SumDigits.sumDigits("123abc123"));
        assertEquals(0, SumDigits.sumDigits(""));
        assertEquals(0, SumDigits.sumDigits("Hello"));
        assertEquals(12, SumDigits.sumDigits("X1z9b2"));
        assertEquals(14, SumDigits.sumDigits("5432a"));
    }
}
