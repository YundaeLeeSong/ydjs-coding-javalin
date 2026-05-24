package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountHiRecursiveTest {
    /**
     * < Q13 >
     * Tests the countHiRecursive method.
     */
    @Test
    public void testCountHiRecursive() {
        assertEquals(1, CountHiRecursive.countHiRecursive("xxhixx"));
        assertEquals(2, CountHiRecursive.countHiRecursive("xhixhix"));
        assertEquals(1, CountHiRecursive.countHiRecursive("hi"));
        assertEquals(2, CountHiRecursive.countHiRecursive("hihih"));
        assertEquals(0, CountHiRecursive.countHiRecursive("h"));
        assertEquals(0, CountHiRecursive.countHiRecursive(""));
        assertEquals(4, CountHiRecursive.countHiRecursive("ihihihihih"));
        assertEquals(5, CountHiRecursive.countHiRecursive("ihihihihihi"));
        assertEquals(3, CountHiRecursive.countHiRecursive("hiAAhi12hi"));
        assertEquals(3, CountHiRecursive.countHiRecursive("xhixhxihihhhih"));
        assertEquals(1, CountHiRecursive.countHiRecursive("ship"));
    }
}
