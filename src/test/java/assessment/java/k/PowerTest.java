package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class PowerTest {
    /**
     * < Q13 >
     * Tests the power method.
     */
    @Test
    public void testPower() {
        assertEquals(1, Power.power(2, 0));
        assertEquals(1, Power.power(5, 0));
        assertEquals(1, Power.power(100, 0));
        assertEquals(2, Power.power(2, 1));
        assertEquals(7, Power.power(7, 1));
        assertEquals(42, Power.power(42, 1));
        assertEquals(4, Power.power(2, 2));
        assertEquals(8, Power.power(2, 3));
        assertEquals(16, Power.power(2, 4));
        assertEquals(9, Power.power(3, 2));
        assertEquals(27, Power.power(3, 3));
        assertEquals(125, Power.power(5, 3));
        assertEquals(256, Power.power(2, 8));
        assertEquals(1024, Power.power(2, 10));
        assertEquals(81, Power.power(3, 4));
        assertEquals(15625, Power.power(5, 6));
        assertEquals(128, Power.power(2, 7));
        assertEquals(512, Power.power(2, 9));
        assertEquals(243, Power.power(3, 5));
        assertEquals(78125, Power.power(5, 7));
        assertEquals(65536, Power.power(2, 16));
        assertEquals(1048576, Power.power(2, 20));
        assertEquals(59049, Power.power(3, 10));
        assertEquals(1000000, Power.power(10, 6));
        assertEquals(1, Power.power(0, 0));
        assertEquals(0, Power.power(0, 1));
        assertEquals(0, Power.power(0, 5));
        assertEquals(1, Power.power(1, 0));
        assertEquals(1, Power.power(1, 100));
        assertEquals(1, Power.power(-1, 0));
        assertEquals(-1, Power.power(-1, 1));
        assertEquals(1, Power.power(-1, 2));
        assertEquals(-1, Power.power(-1, 3));
        assertEquals(4, Power.power(-2, 2));
        assertEquals(-8, Power.power(-2, 3));
        assertEquals(81, Power.power(-3, 4));
        assertEquals(-243, Power.power(-3, 5));
    }
}


