package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoresAverageTest {
    @Test
    public void testScoresAverage() {
        assertEquals(4, ScoresAverage.scoresAverage(new int[]{2, 2, 4, 4}));
        assertEquals(4, ScoresAverage.scoresAverage(
            new int[]{4, 4, 4, 2, 2, 2}));
        assertEquals(4, ScoresAverage.scoresAverage(
            new int[]{3, 4, 5, 1, 2, 3}));
        assertEquals(6, ScoresAverage.scoresAverage(new int[]{5, 6}));
        assertEquals(5, ScoresAverage.scoresAverage(new int[]{5, 4}));
        assertEquals(5, ScoresAverage.scoresAverage(
            new int[]{5, 4, 5, 6, 2, 1, 2, 3}));
    }
}
