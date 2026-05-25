package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CanBalanceTest {
    /**
     * < Q2 >
     * Tests the canBalance method.
     */
    @Test
    public void testCanBalance() {
        assertTrue(CanBalance.canBalance(new int[]{1, 1, 1, 2, 1}));
        assertFalse(CanBalance.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertTrue(CanBalance.canBalance(new int[]{10, 10}));
        assertTrue(CanBalance.canBalance(new int[]{10, 0, 1, -1, 10}));
        assertTrue(CanBalance.canBalance(new int[]{1, 1, 1, 1, 4}));
        assertFalse(CanBalance.canBalance(new int[]{2, 1, 1, 1, 4}));
        assertFalse(CanBalance.canBalance(new int[]{2, 3, 4, 1, 2}));
        assertTrue(CanBalance.canBalance(new int[]{1, 2, 3, 1, 0, 2, 3}));
        assertFalse(CanBalance.canBalance(new int[]{1, 2, 3, 1, 0, 1, 3}));
        assertFalse(CanBalance.canBalance(new int[]{1}));
    }
}


