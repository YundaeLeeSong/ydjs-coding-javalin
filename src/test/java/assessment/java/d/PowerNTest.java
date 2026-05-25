package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class PowerNTest {
    /**
     * < Q11 >
     * Tests the powerN method.
     */
    @Test
    public void testPowerN() {
        assertEquals(3, PowerN.powerN(3, 1));
        assertEquals(9, PowerN.powerN(3, 2));
        assertEquals(27, PowerN.powerN(3, 3));
        assertEquals(2, PowerN.powerN(2, 1));
        assertEquals(4, PowerN.powerN(2, 2));
        assertEquals(8, PowerN.powerN(2, 3));
        assertEquals(16, PowerN.powerN(2, 4));
        assertEquals(32, PowerN.powerN(2, 5));
        assertEquals(10, PowerN.powerN(10, 1));
        assertEquals(100, PowerN.powerN(10, 2));
        assertEquals(1000, PowerN.powerN(10, 3));
    }
}


