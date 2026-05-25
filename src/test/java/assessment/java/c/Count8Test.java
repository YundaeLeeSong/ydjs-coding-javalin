package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Count8Test {
    /**
     * < Q14 >
     * Tests the count8 method.
     */
    @Test
    public void testCount8() {
        assertEquals(1, Count8.count8(8));
        assertEquals(2, Count8.count8(818));
        assertEquals(4, Count8.count8(8818));
        assertEquals(4, Count8.count8(8088));
        assertEquals(0, Count8.count8(123));
        assertEquals(2, Count8.count8(81238));
        assertEquals(6, Count8.count8(88788));
        assertEquals(1, Count8.count8(8234));
        assertEquals(1, Count8.count8(2348));
        assertEquals(3, Count8.count8(23884));
        assertEquals(0, Count8.count8(0));
        assertEquals(5, Count8.count8(1818188));
        assertEquals(5, Count8.count8(8818181));
        assertEquals(1, Count8.count8(1080));
        assertEquals(3, Count8.count8(188));
        assertEquals(9, Count8.count8(88888));
        assertEquals(2, Count8.count8(9898));
        assertEquals(1, Count8.count8(78));
    }
}


