package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class StrCountTest {
    /**
     * < Q14 >
     * Tests the strCount method.
     */
    @Test
    public void testStrCount() {
        assertEquals(2, StrCount.strCount("catcowcat", "cat"));
        assertEquals(1, StrCount.strCount("catcowcat", "cow"));
        assertEquals(0, StrCount.strCount("catcowcat", "dog"));
        assertEquals(2, StrCount.strCount("cacatcowcat", "cat"));
        assertEquals(2, StrCount.strCount("xyx", "x"));
        assertEquals(4, StrCount.strCount("iiiijj", "i"));
        assertEquals(2, StrCount.strCount("iiiijj", "ii"));
        assertEquals(1, StrCount.strCount("iiiijj", "iii"));
        assertEquals(2, StrCount.strCount("iiiijj", "j"));
        assertEquals(1, StrCount.strCount("iiiijj", "jj"));
        assertEquals(4, StrCount.strCount("aaabababab", "ab"));
        assertEquals(1, StrCount.strCount("aaabababab", "aa"));
        assertEquals(6, StrCount.strCount("aaabababab", "a"));
        assertEquals(4, StrCount.strCount("aaabababab", "b"));
    }
}
