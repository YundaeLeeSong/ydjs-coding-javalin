package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MatchUpTest {
    /**
     * < Q4 >
     * Tests the matchUp method.
     */
    @Test
    public void testMatchUp() {
        assertEquals(2, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
        assertEquals(1, MatchUp.matchUp(new int[]{5, 3}, new int[]{5, 5}));
        assertEquals(2, MatchUp.matchUp(new int[]{5, 3}, new int[]{4, 4}));
        assertEquals(1, MatchUp.matchUp(new int[]{5, 3}, new int[]{3, 3}));
        assertEquals(1, MatchUp.matchUp(new int[]{5, 3}, new int[]{2, 2}));
        assertEquals(1, MatchUp.matchUp(new int[]{5, 3}, new int[]{1, 1}));
        assertEquals(0, MatchUp.matchUp(new int[]{5, 3}, new int[]{0, 0}));
        assertEquals(0, MatchUp.matchUp(new int[]{4}, new int[]{4}));
        assertEquals(1, MatchUp.matchUp(new int[]{4}, new int[]{5}));
    }
}
