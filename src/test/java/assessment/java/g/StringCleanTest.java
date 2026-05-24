package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class StringCleanTest {
    /**
     * < Q14 >
     * Tests the stringClean method.
     */
    @Test
    public void testStringClean() {
        assertEquals("yza", StringClean.stringClean("yyzzza"));
        assertEquals("abcd", StringClean.stringClean("abbbcdd"));
        assertEquals("Helo", StringClean.stringClean("Hello"));
        assertEquals("XabcY", StringClean.stringClean("XXabcYY"));
        assertEquals("12ab45", StringClean.stringClean("112ab445"));
        assertEquals("Helo Bokeper", StringClean.stringClean("Hello Bookkeeper"));
    }
}
