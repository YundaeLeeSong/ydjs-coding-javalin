package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountEvensTest {
    /**
     * < Q4 >
     * Tests the countEvens method.
     */
    @Test
    public void testCountEvens() {
        assertEquals(3, CountEvens.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, CountEvens.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, CountEvens.countEvens(new int[]{1, 3, 5}));
        assertEquals(0, CountEvens.countEvens(new int[]{}));
        assertEquals(1, CountEvens.countEvens(new int[]{11, 9, 0, 1}));
        assertEquals(2, CountEvens.countEvens(new int[]{2, 11, 9, 0}));
        assertEquals(1, CountEvens.countEvens(new int[]{2}));
        assertEquals(2, CountEvens.countEvens(new int[]{2, 5, 12}));
    }
}


