package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Array220Test {
    /**
     * < Q11 >
     * Tests the array220 method.
     */
    @Test
    public void testArray220() {
        assertTrue(Array220.array220(new int[]{1, 2, 20}, 0));
        assertTrue(Array220.array220(new int[]{3, 30}, 0));
        assertFalse(Array220.array220(new int[]{3}, 0));
        assertFalse(Array220.array220(new int[]{}, 0));
        assertTrue(Array220.array220(new int[]{3, 3, 30, 4}, 0));
        assertFalse(Array220.array220(new int[]{2, 19, 4}, 0));
        assertFalse(Array220.array220(new int[]{20, 2, 21}, 0));
        assertTrue(Array220.array220(new int[]{20, 2, 21, 210}, 0));
        assertTrue(Array220.array220(new int[]{2, 200, 2000}, 0));
        assertTrue(Array220.array220(new int[]{0, 0}, 0));
        assertFalse(Array220.array220(new int[]{1, 2, 3, 4, 5, 6}, 0));
        assertTrue(Array220.array220(new int[]{1, 2, 3, 4, 5, 50, 6}, 0));
        assertFalse(Array220.array220(new int[]{1, 2, 3, 4, 5, 51, 6}, 0));
        assertTrue(Array220.array220(new int[]{1, 2, 3, 4, 4, 50, 500, 6}, 0));
    }
}
