package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class XyzMiddleTest {
    /**
     * < Q9 >
     * Tests the xyzMiddle method.
     */
    @Test
    public void testXyzMiddle() {
        assertTrue(XyzMiddle.xyzMiddle("AAxyzBB"));
        assertTrue(XyzMiddle.xyzMiddle("AxyzBB"));
        assertFalse(XyzMiddle.xyzMiddle("AxyzBBB"));
        assertFalse(XyzMiddle.xyzMiddle("AxyzBBBB"));
        assertFalse(XyzMiddle.xyzMiddle("AAAxyzB"));
        assertTrue(XyzMiddle.xyzMiddle("AAAxyzBB"));
        assertFalse(XyzMiddle.xyzMiddle("AAAAxyzBB"));
        assertFalse(XyzMiddle.xyzMiddle("AAAAAxyzBBB"));
        assertTrue(XyzMiddle.xyzMiddle("1x345xyz12x4"));
        assertTrue(XyzMiddle.xyzMiddle("xyzAxyzBBB"));
        assertTrue(XyzMiddle.xyzMiddle("xyzAxyzBxyz"));
        assertTrue(XyzMiddle.xyzMiddle("xyzxyzAxyzBxyzxyz"));
        assertTrue(XyzMiddle.xyzMiddle("xyzxyzxyzBxyzxyz"));
        assertTrue(XyzMiddle.xyzMiddle("xyzxyzAxyzxyzxyz"));
        assertFalse(XyzMiddle.xyzMiddle("xyzxyzAxyzxyzxy"));
        assertFalse(XyzMiddle.xyzMiddle("AxyzxyzBB"));
        assertFalse(XyzMiddle.xyzMiddle(""));
        assertFalse(XyzMiddle.xyzMiddle("x"));
        assertFalse(XyzMiddle.xyzMiddle("xy"));
        assertTrue(XyzMiddle.xyzMiddle("xyz"));
        assertTrue(XyzMiddle.xyzMiddle("xyzz"));
    }
}


