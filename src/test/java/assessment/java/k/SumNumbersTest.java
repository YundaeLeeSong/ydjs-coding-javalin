package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SumNumbersTest {
    /**
     * < Q3 >
     * Tests the sumNumbers method.
     */
    @Test
    public void testSumNumbers() {
        assertEquals(123, SumNumbers.sumNumbers("abc123xyz"));
        assertEquals(44, SumNumbers.sumNumbers("aa11b33"));
        assertEquals(18, SumNumbers.sumNumbers("7 11"));
        assertEquals(0, SumNumbers.sumNumbers("Chocolate"));
        assertEquals(7, SumNumbers.sumNumbers("5hoco1a1e"));
        assertEquals(7, SumNumbers.sumNumbers("5$1; ;1!!"));
        assertEquals(1245, SumNumbers.sumNumbers("a1234bb11"));
        assertEquals(0, SumNumbers.sumNumbers(""));
        assertEquals(25, SumNumbers.sumNumbers("a22bbb3"));
    }
}
