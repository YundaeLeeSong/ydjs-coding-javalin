package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class NoTeenSumTest {
    /**
     * < Q10 >
     * Tests the noTeenSum method.
     */
    @Test
    public void testNoTeenSum() {
        assertEquals(6, NoTeenSum.noTeenSum(1, 2, 3));
        assertEquals(3, NoTeenSum.noTeenSum(2, 13, 1));
        assertEquals(3, NoTeenSum.noTeenSum(2, 1, 14));
        assertEquals(18, NoTeenSum.noTeenSum(2, 1, 15));
        assertEquals(19, NoTeenSum.noTeenSum(2, 1, 16));
        assertEquals(3, NoTeenSum.noTeenSum(2, 1, 17));
        assertEquals(3, NoTeenSum.noTeenSum(17, 1, 2));
        assertEquals(19, NoTeenSum.noTeenSum(2, 15, 2));
        assertEquals(16, NoTeenSum.noTeenSum(16, 17, 18));
        assertEquals(0, NoTeenSum.noTeenSum(17, 18, 19));
        assertEquals(32, NoTeenSum.noTeenSum(15, 16, 1));
        assertEquals(30, NoTeenSum.noTeenSum(15, 15, 19));
        assertEquals(31, NoTeenSum.noTeenSum(15, 19, 16));
        assertEquals(5, NoTeenSum.noTeenSum(5, 17, 18));
        assertEquals(16, NoTeenSum.noTeenSum(17, 18, 16));
        assertEquals(0, NoTeenSum.noTeenSum(17, 19, 18));
    }
}


