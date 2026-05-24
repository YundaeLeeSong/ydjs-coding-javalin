package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SameEndsListTest {
    /**
     * < Q8 >
     * Tests the sameEnds method (list version).
     */
    @Test
    public void testSameEndsList() {
        assertFalse(SameEndsList.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        assertTrue(SameEndsList.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        assertFalse(SameEndsList.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
        assertTrue(SameEndsList.sameEnds(new int[]{1, 2, 5, 2, 1}, 1));
        assertFalse(SameEndsList.sameEnds(new int[]{1, 2, 5, 2, 1}, 2));
        assertTrue(SameEndsList.sameEnds(new int[]{1, 2, 5, 2, 1}, 0));
        assertTrue(SameEndsList.sameEnds(new int[]{1, 2, 5, 2, 1}, 5));
        assertTrue(SameEndsList.sameEnds(new int[]{1, 1, 1}, 0));
        assertTrue(SameEndsList.sameEnds(new int[]{1, 1, 1}, 1));
        assertTrue(SameEndsList.sameEnds(new int[]{1, 1, 1}, 2));
        assertTrue(SameEndsList.sameEnds(new int[]{1, 1, 1}, 3));
        assertTrue(SameEndsList.sameEnds(new int[]{1}, 1));
        assertTrue(SameEndsList.sameEnds(new int[]{}, 0));
        assertFalse(SameEndsList.sameEnds(new int[]{4, 2, 4, 5}, 1));
    }
}
