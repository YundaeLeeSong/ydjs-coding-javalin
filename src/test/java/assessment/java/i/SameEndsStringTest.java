package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SameEndsStringTest {
    /**
     * < Q1 >
     * Tests the sameEnds method (string version).
     */
    @Test
    public void testSameEndsString() {
        assertEquals("ab", SameEndsString.sameEnds("abXYab"));
        assertEquals("x", SameEndsString.sameEnds("xx"));
        assertEquals("x", SameEndsString.sameEnds("xxx"));
        assertEquals("xx", SameEndsString.sameEnds("xxxx"));
        assertEquals("java", SameEndsString.sameEnds("javaXYZjava"));
        assertEquals("java", SameEndsString.sameEnds("javajava"));
        assertEquals("", SameEndsString.sameEnds("xavaXYZjava"));
        assertEquals("Hello!", SameEndsString.sameEnds("Hello! and Hello!"));
        assertEquals("", SameEndsString.sameEnds("x"));
        assertEquals("", SameEndsString.sameEnds(""));
        assertEquals("", SameEndsString.sameEnds("abcb"));
        assertEquals("my", SameEndsString.sameEnds("mymmy"));
    }
}
