package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GHappyTest {
    /**
     * < Q1 >
     * Tests the gHappy method.
     */
    @Test
    public void testGHappy() {
        assertTrue(GHappy.gHappy("xxggxx"));
        assertFalse(GHappy.gHappy("xxgxx"));
        assertFalse(GHappy.gHappy("xxggyygxx"));
        assertFalse(GHappy.gHappy("g"));
        assertTrue(GHappy.gHappy("gg"));
        assertTrue(GHappy.gHappy(""));
        assertTrue(GHappy.gHappy("xxgggxyz"));
        assertFalse(GHappy.gHappy("xxgggxyg"));
        assertTrue(GHappy.gHappy("xxgggxygg"));
        assertFalse(GHappy.gHappy("mgm"));
        assertTrue(GHappy.gHappy("mggm"));
        assertTrue(GHappy.gHappy("yyygggxyy"));
    }
}


