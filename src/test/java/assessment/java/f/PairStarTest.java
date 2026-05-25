package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class PairStarTest {
    /**
     * < Q13 >
     * Tests the pairStar method.
     */
    @Test
    public void testPairStar() {
        assertEquals("hel*lo", PairStar.pairStar("hello"));
        assertEquals("x*xy*y", PairStar.pairStar("xxyy"));
        assertEquals("a*a*a*a", PairStar.pairStar("aaaa"));
        assertEquals("a*a*ab", PairStar.pairStar("aaab"));
        assertEquals("a*a", PairStar.pairStar("aa"));
        assertEquals("a", PairStar.pairStar("a"));
        assertEquals("", PairStar.pairStar(""));
        assertEquals("noadjacent", PairStar.pairStar("noadjacent"));
        assertEquals("ab*ba", PairStar.pairStar("abba"));
        assertEquals("ab*b*ba", PairStar.pairStar("abbba"));
    }
}


