package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountXTest {
    /**
     * < Q12 >
     * Tests the countX method.
     */
    @Test
    public void testCountX() {
        assertEquals(4, CountX.countX("xxhixx"));
        assertEquals(3, CountX.countX("xhixhix"));
        assertEquals(0, CountX.countX("hi"));
        assertEquals(0, CountX.countX("h"));
        assertEquals(1, CountX.countX("x"));
        assertEquals(0, CountX.countX(""));
        assertEquals(0, CountX.countX("hihi"));
        assertEquals(0, CountX.countX("hiAAhi12hi"));
    }
}
