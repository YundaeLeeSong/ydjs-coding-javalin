package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoresClumpTest {
    @Test
    public void testScoresClump() {
        assertTrue(ScoresClump.scoresClump(new int[]{3, 4, 5}));
        assertFalse(ScoresClump.scoresClump(new int[]{3, 4, 6}));
        assertTrue(ScoresClump.scoresClump(new int[]{1, 3, 5, 5}));
        assertTrue(ScoresClump.scoresClump(new int[]{2, 4, 5, 6}));
        assertFalse(ScoresClump.scoresClump(new int[]{2, 4, 5, 7}));
        assertTrue(ScoresClump.scoresClump(new int[]{2, 4, 4, 7}));
        assertFalse(ScoresClump.scoresClump(new int[]{3, 3, 6, 7, 9}));
        assertTrue(ScoresClump.scoresClump(new int[]{3, 3, 7, 7, 9}));
        assertFalse(ScoresClump.scoresClump(new int[]{4, 5, 8}));
    }
}
