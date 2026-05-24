package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class TripleUpTest {
    /**
     * < Q9 >
     * Tests the tripleUp method.
     */
    @Test
    public void testTripleUp() {
        assertTrue(TripleUp.tripleUp(new int[]{1, 4, 5, 6, 2}));
        assertTrue(TripleUp.tripleUp(new int[]{1, 2, 3}));
        assertFalse(TripleUp.tripleUp(new int[]{1, 2, 4}));
        assertTrue(TripleUp.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
        assertFalse(TripleUp.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 7, 7, 6}));
        assertFalse(TripleUp.tripleUp(new int[]{1, 2}));
        assertFalse(TripleUp.tripleUp(new int[]{1}));
        assertFalse(TripleUp.tripleUp(new int[]{}));
        assertTrue(TripleUp.tripleUp(new int[]{10, 9, 8, -100, -99, -98, 100}));
        assertFalse(TripleUp.tripleUp(new int[]{10, 9, 8, -100, -99, 99, 100}));
        assertTrue(TripleUp.tripleUp(new int[]{-100, -99, -99, 100, 101, 102}));
        assertFalse(TripleUp.tripleUp(new int[]{2, 3, 5, 6, 8, 9, 2, 3}));
    }
}
