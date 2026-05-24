package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MatchUpTest {
    /**
     * < Q2 >
     * Tests the matchUp method.
     */
    @Test
    public void testMatchUp() {
        assertEquals(1, MatchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        assertEquals(2, MatchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        assertEquals(1, MatchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
        assertEquals(1, MatchUp.matchUp(new String[]{"", "", "ccc"}, new String[]{"aa", "bb", "cc"}));
        assertEquals(0, MatchUp.matchUp(new String[]{"", "", ""}, new String[]{"", "bb", "cc"}));
        assertEquals(0, MatchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", ""}));
        assertEquals(1, MatchUp.matchUp(new String[]{"aa", "", "ccc"}, new String[]{"", "bb", "cc"}));
        assertEquals(0, MatchUp.matchUp(new String[]{"x", "y", "z"}, new String[]{"y", "z", "x"}));
        assertEquals(1, MatchUp.matchUp(new String[]{"", "y", "z"}, new String[]{"", "y", "x"}));
        assertEquals(3, MatchUp.matchUp(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", "zzz"}));
        assertEquals(2, MatchUp.matchUp(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", ""}));
        assertEquals(3, MatchUp.matchUp(new String[]{"b", "x", "y", "z"}, new String[]{"a", "xx", "yyy", "zzz"}));
        assertEquals(1, MatchUp.matchUp(new String[]{"aaa", "bb", "c"}, new String[]{"aaa", "xx", "bb"}));
    }
}
