package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class EndOtherTest {
    /**
     * < Q7 >
     * Tests the endOther method.
     */
    @Test
    public void testEndOther() {
        assertTrue(EndOther.endOther("Hiabc", "abc"));
        assertTrue(EndOther.endOther("AbC", "HiaBc"));
        assertTrue(EndOther.endOther("abc", "abXabc"));
        assertFalse(EndOther.endOther("Hiabc", "abcd"));
        assertTrue(EndOther.endOther("Hiabc", "bc"));
        assertFalse(EndOther.endOther("Hiabcx", "bc"));
        assertTrue(EndOther.endOther("abc", "abc"));
        assertTrue(EndOther.endOther("xyz", "12xyz"));
        assertFalse(EndOther.endOther("yz", "12xz"));
        assertTrue(EndOther.endOther("Z", "12xz"));
        assertTrue(EndOther.endOther("12", "12"));
        assertFalse(EndOther.endOther("abcXYZ", "abcDEF"));
        assertFalse(EndOther.endOther("ab", "ab12"));
        assertTrue(EndOther.endOther("ab", "12ab"));
    }
}
