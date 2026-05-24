package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class XyzThereTest {
    /**
     * < Q8 >
     * Tests the xyzThere method.
     */
    @Test
    public void testXyzThere() {
        assertTrue(XyzThere.xyzThere("abcxyz"));
        assertFalse(XyzThere.xyzThere("abc.xyz"));
        assertTrue(XyzThere.xyzThere("xyz.abc"));
        assertFalse(XyzThere.xyzThere("abcxy"));
        assertTrue(XyzThere.xyzThere("xyz"));
        assertFalse(XyzThere.xyzThere("xy"));
        assertFalse(XyzThere.xyzThere("x"));
        assertFalse(XyzThere.xyzThere(""));
        assertTrue(XyzThere.xyzThere("abc.xyzxyz"));
        assertTrue(XyzThere.xyzThere("abc.xxyz"));
        assertFalse(XyzThere.xyzThere(".xyz"));
        assertFalse(XyzThere.xyzThere("12.xyz"));
        assertTrue(XyzThere.xyzThere("12xyz"));
        assertFalse(XyzThere.xyzThere("1.xyz.xyz2.xyz"));
    }
}
