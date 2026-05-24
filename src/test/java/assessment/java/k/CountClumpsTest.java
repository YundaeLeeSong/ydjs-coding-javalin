package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountClumpsTest {
    /**
     * < Q7 >
     * Tests the countClumps method.
     */
    @Test
    public void testCountClumps() {
        assertEquals(2, CountClumps.countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        assertEquals(2, CountClumps.countClumps(new int[]{1, 1, 2, 1, 1}));
        assertEquals(1, CountClumps.countClumps(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, CountClumps.countClumps(new int[]{1, 2, 3}));
        assertEquals(4, CountClumps.countClumps(new int[]{2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(4, CountClumps.countClumps(new int[]{0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(5, CountClumps.countClumps(new int[]{0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(5, CountClumps.countClumps(new int[]{0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(0, CountClumps.countClumps(new int[]{}));
    }
}
