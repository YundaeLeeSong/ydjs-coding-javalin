package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ScoresSpecialTest {
    /**
     * < Q5 >
     * Tests the scoresSpecial method.
     */
    @Test
    public void testScoresSpecial() {
        assertEquals(40, ScoresSpecial.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
        assertEquals(40, ScoresSpecial.scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}));
        assertEquals(20, ScoresSpecial.scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}));
        assertEquals(50, ScoresSpecial.scoresSpecial(new int[]{1, 20, 2, 50}, new int[]{3, 4, 5}));
        assertEquals(50, ScoresSpecial.scoresSpecial(new int[]{3, 4, 5}, new int[]{1, 50, 2, 20}));
        assertEquals(50, ScoresSpecial.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{20}));
        assertEquals(50, ScoresSpecial.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{3, 20, 99}));
        assertEquals(60, ScoresSpecial.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{30, 20, 99}));
        assertEquals(0, ScoresSpecial.scoresSpecial(new int[]{}, new int[]{2}));
        assertEquals(20, ScoresSpecial.scoresSpecial(new int[]{}, new int[]{20}));
        assertEquals(40, ScoresSpecial.scoresSpecial(new int[]{14, 10, 4}, new int[]{4, 20, 30}));
    }
}
