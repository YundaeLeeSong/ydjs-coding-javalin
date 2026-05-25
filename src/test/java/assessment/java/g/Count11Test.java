package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Count11Test {
    /**
     * < Q13 >
     * Tests the count11 method.
     */
    @Test
    public void testCount11() {
        assertEquals(2, Count11.count11("11abc11"));
        assertEquals(3, Count11.count11("abc11x11x11"));
        assertEquals(1, Count11.count11("111"));
        assertEquals(2, Count11.count11("1111"));
        assertEquals(0, Count11.count11("1"));
        assertEquals(0, Count11.count11(""));
        assertEquals(0, Count11.count11("hi"));
        assertEquals(4, Count11.count11("11x111x1111"));
        assertEquals(1, Count11.count11("1x111"));
        assertEquals(0, Count11.count11("1Hello1"));
        assertEquals(0, Count11.count11("Hello"));
    }
}


