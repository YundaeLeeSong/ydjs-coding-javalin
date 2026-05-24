package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class StrCopiesTest {
    /**
     * < Q11 >
     * Tests the strCopies method.
     */
    @Test
    public void testStrCopies() {
        assertTrue(StrCopies.strCopies("catcowcat", "cat", 2));
        assertFalse(StrCopies.strCopies("catcowcat", "cow", 2));
        assertTrue(StrCopies.strCopies("catcowcat", "cow", 1));
        assertTrue(StrCopies.strCopies("iiijjj", "i", 3));
        assertFalse(StrCopies.strCopies("iiijjj", "i", 4));
        assertTrue(StrCopies.strCopies("iiijjj", "ii", 2));
        assertFalse(StrCopies.strCopies("iiijjj", "ii", 3));
        assertFalse(StrCopies.strCopies("iiijjj", "x", 3));
        assertTrue(StrCopies.strCopies("iiijjj", "x", 0));
        assertTrue(StrCopies.strCopies("iiiiij", "iii", 3));
        assertFalse(StrCopies.strCopies("iiiiij", "iii", 4));
        assertTrue(StrCopies.strCopies("ijiiiiij", "iiii", 2));
        assertFalse(StrCopies.strCopies("ijiiiiij", "iiii", 3));
        assertTrue(StrCopies.strCopies("dogcatdogcat", "dog", 2));
    }
}
