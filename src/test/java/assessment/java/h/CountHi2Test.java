package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountHi2Test {
    /**
     * < Q11 >
     * Tests the countHi2 method.
     */
    @Test
    public void testCountHi2() {
        assertEquals(1, CountHi2.countHi2("ahixhi"));
        assertEquals(2, CountHi2.countHi2("ahibhi"));
        assertEquals(0, CountHi2.countHi2("xhixhi"));
        assertEquals(1, CountHi2.countHi2("hixhi"));
        assertEquals(2, CountHi2.countHi2("hixhhi"));
        assertEquals(3, CountHi2.countHi2("hihihi"));
        assertEquals(3, CountHi2.countHi2("hihihix"));
        assertEquals(2, CountHi2.countHi2("xhihihix"));
        assertEquals(0, CountHi2.countHi2("xxhi"));
        assertEquals(1, CountHi2.countHi2("hixxhi"));
        assertEquals(1, CountHi2.countHi2("hi"));
        assertEquals(0, CountHi2.countHi2("xxxx"));
        assertEquals(0, CountHi2.countHi2("h"));
        assertEquals(0, CountHi2.countHi2("x"));
        assertEquals(0, CountHi2.countHi2(""));
        assertEquals(1, CountHi2.countHi2("Hellohi"));
    }
}
