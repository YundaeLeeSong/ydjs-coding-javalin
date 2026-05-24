package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ScoreUpTest {
    /**
     * < Q3 >
     * Tests the scoreUp method.
     */
    @Test
    public void testScoreUp() {
        assertEquals(6, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}));
        assertEquals(11, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));
        assertEquals(16, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}));
        assertEquals(3, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "b", "?"}));
        assertEquals(-1, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "?", "?"}));
        assertEquals(7, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"c", "?", "b", "b"}));
        assertEquals(3, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"c", "?", "b", "?"}));
        assertEquals(2, ScoreUp.scoreUp(new String[]{"a", "b", "c"}, new String[]{"a", "c", "b"}));
        assertEquals(4, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "a", "c", "a", "c"}));
        assertEquals(6, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "?", "?", "a", "c"}));
        assertEquals(11, ScoreUp.scoreUp(new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "?", "?", "c", "c"}));
        assertEquals(12, ScoreUp.scoreUp(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
    }
}
