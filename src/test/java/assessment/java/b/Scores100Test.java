package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Scores100Test {
    @Test
    public void testScores100() {
        assertTrue(Scores100.scores100(new int[]{1, 100, 100}));
        assertFalse(Scores100.scores100(new int[]{1, 100, 99, 100}));
        assertTrue(Scores100.scores100(new int[]{100, 1, 100, 100}));
        assertFalse(Scores100.scores100(new int[]{100, 1, 100, 1}));
        assertFalse(Scores100.scores100(new int[]{1, 2, 3, 4, 5}));
        assertFalse(Scores100.scores100(new int[]{1, 2, 100, 4, 5}));
    }
}


