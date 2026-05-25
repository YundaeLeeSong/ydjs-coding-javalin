package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class EndXTest {
    /**
     * < Q14 >
     * Tests the endX method.
     */
    @Test
    public void testEndX() {
        assertEquals("rexx", EndX.endX("xxre"));
        assertEquals("hixxxx", EndX.endX("xxhixx"));
        assertEquals("hihixxx", EndX.endX("xhixhix"));
        assertEquals("hiy", EndX.endX("hiy"));
        assertEquals("h", EndX.endX("h"));
        assertEquals("x", EndX.endX("x"));
        assertEquals("xx", EndX.endX("xx"));
        assertEquals("", EndX.endX(""));
        assertEquals("bxx", EndX.endX("bxx"));
        assertEquals("baxx", EndX.endX("bxax"));
        assertEquals("aaaxxx", EndX.endX("axaxax"));
        assertEquals("hixxx", EndX.endX("xxhxi"));
    }
}


