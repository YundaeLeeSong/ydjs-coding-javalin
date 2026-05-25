package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MirrorEndsTest {
    /**
     * < Q2 >
     * Tests the mirrorEnds method.
     */
    @Test
    public void testMirrorEnds() {
        assertEquals("ab", MirrorEnds.mirrorEnds("abXYZba"));
        assertEquals("a", MirrorEnds.mirrorEnds("abca"));
        assertEquals("aba", MirrorEnds.mirrorEnds("aba"));
        assertEquals("", MirrorEnds.mirrorEnds("abab"));
        assertEquals("xxx", MirrorEnds.mirrorEnds("xxx"));
        assertEquals("xxYxx", MirrorEnds.mirrorEnds("xxYxx"));
        assertEquals("Hi", MirrorEnds.mirrorEnds("Hi and iH"));
        assertEquals(" x ", MirrorEnds.mirrorEnds(" x "));
        assertEquals("", MirrorEnds.mirrorEnds(""));
        assertEquals("123", MirrorEnds.mirrorEnds("123and then 321"));
        assertEquals("ba", MirrorEnds.mirrorEnds("band andab"));
    }
}


