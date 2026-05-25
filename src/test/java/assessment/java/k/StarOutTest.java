package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class StarOutTest {
    /**
     * < Q5 >
     * Tests the starOut method.
     */
    @Test
    public void testStarOut() {
        assertEquals("ad", StarOut.starOut("ab*cd"));
        assertEquals("ad", StarOut.starOut("ab**cd"));
        assertEquals("silly", StarOut.starOut("sm*eilly"));
        assertEquals("siy", StarOut.starOut("sm*eil*ly"));
        assertEquals("siy", StarOut.starOut("sm**eil*ly"));
        assertEquals("siy", StarOut.starOut("sm***eil*ly"));
        assertEquals("string", StarOut.starOut("stringy*"));
        assertEquals("tringy", StarOut.starOut("*stringy"));
        assertEquals("ty", StarOut.starOut("*str*in*gy"));
        assertEquals("abc", StarOut.starOut("abc"));
        assertEquals("c", StarOut.starOut("a*bc"));
        assertEquals("ab", StarOut.starOut("ab"));
        assertEquals("", StarOut.starOut("a*b"));
        assertEquals("a", StarOut.starOut("a"));
        assertEquals("", StarOut.starOut("a*"));
        assertEquals("", StarOut.starOut("*a"));
        assertEquals("", StarOut.starOut("*"));
        assertEquals("", StarOut.starOut(""));
    }
}


