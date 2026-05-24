package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoresIncreasingTest {
    @Test
    public void testScoresIncreasing() {
        assertTrue(ScoresIncreasing.scoresIncreasing(new int[]{1, 3, 4}));
        assertFalse(ScoresIncreasing.scoresIncreasing(new int[]{1, 3, 2}));
        assertTrue(ScoresIncreasing.scoresIncreasing(new int[]{1, 1, 4}));
        assertTrue(ScoresIncreasing.scoresIncreasing(new int[]{1, 1, 2, 4, 4, 7}));
        assertFalse(ScoresIncreasing.scoresIncreasing(new int[]{1, 1, 2, 4, 3, 7}));
        assertTrue(ScoresIncreasing.scoresIncreasing(new int[]{-5, 4, 11}));
    }
}
