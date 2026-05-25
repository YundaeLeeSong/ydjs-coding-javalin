package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class RepeatEndTest {
    /**
     * < Q5 >
     * Tests the repeatEnd method.
     */
    @Test
    public void testRepeatEnd() {
        assertEquals("llollollo", RepeatEnd.repeatEnd("Hello", 3));
        assertEquals("lolo", RepeatEnd.repeatEnd("Hello", 2));
        assertEquals("o", RepeatEnd.repeatEnd("Hello", 1));
        assertEquals("", RepeatEnd.repeatEnd("Hello", 0));
        assertEquals("abcabcabc", RepeatEnd.repeatEnd("abc", 3));
        assertEquals("3434", RepeatEnd.repeatEnd("1234", 2));
        assertEquals("234234234", RepeatEnd.repeatEnd("1234", 3));
        assertEquals("", RepeatEnd.repeatEnd("", 0));
    }
}


