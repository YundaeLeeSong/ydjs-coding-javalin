package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntMaxTest {
    @Test
    public void testIntMax() {
        assertEquals(3, IntMax.intMax(1, 2, 3));
        assertEquals(3, IntMax.intMax(1, 3, 2));
        assertEquals(3, IntMax.intMax(3, 2, 1));
        assertEquals(9, IntMax.intMax(9, 3, 3));
        assertEquals(9, IntMax.intMax(3, 9, 3));
        assertEquals(9, IntMax.intMax(3, 3, 9));
        assertEquals(8, IntMax.intMax(8, 2, 3));
        assertEquals(-1, IntMax.intMax(-3, -1, -2));
        assertEquals(6, IntMax.intMax(6, 2, 5));
        assertEquals(6, IntMax.intMax(5, 6, 2));
        assertEquals(6, IntMax.intMax(5, 2, 6));
    }
}
