package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountPairsTest {
    /**
     * < Q11 >
     * Tests the countPairs method.
     */
    @Test
    public void testCountPairs() {
        assertEquals(1, CountPairs.countPairs("axa"));
        assertEquals(2, CountPairs.countPairs("axax"));
        assertEquals(1, CountPairs.countPairs("axbx"));
        assertEquals(0, CountPairs.countPairs("hi"));
        assertEquals(3, CountPairs.countPairs("hihih"));
        assertEquals(3, CountPairs.countPairs("ihihhh"));
        assertEquals(0, CountPairs.countPairs("ihjxhh"));
        assertEquals(0, CountPairs.countPairs(""));
        assertEquals(0, CountPairs.countPairs("a"));
        assertEquals(0, CountPairs.countPairs("aa"));
        assertEquals(1, CountPairs.countPairs("aaa"));
    }
}
