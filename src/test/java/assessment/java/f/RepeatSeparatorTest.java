package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class RepeatSeparatorTest {
    /**
     * < Q5 >
     * Tests the repeatSeparator method.
     */
    @Test
    public void testRepeatSeparator() {
        assertEquals("WordXWordXWord", 
            RepeatSeparator.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", 
            RepeatSeparator.repeatSeparator("This", "And", 2));
        assertEquals("This", RepeatSeparator.repeatSeparator("This", "And", 1));
        assertEquals("Hi-n-Hi", 
            RepeatSeparator.repeatSeparator("Hi", "-n-", 2));
        assertEquals("AAA", RepeatSeparator.repeatSeparator("AAA", "", 1));
        assertEquals("", RepeatSeparator.repeatSeparator("AAA", "", 0));
        assertEquals("ABABABABA", 
            RepeatSeparator.repeatSeparator("A", "B", 5));
        assertEquals("abcXXabcXXabc", 
            RepeatSeparator.repeatSeparator("abc", "XX", 3));
        assertEquals("abcXXabc", 
            RepeatSeparator.repeatSeparator("abc", "XX", 2));
        assertEquals("abc", RepeatSeparator.repeatSeparator("abc", "XX", 1));
        assertEquals("XYZaXYZ", 
            RepeatSeparator.repeatSeparator("XYZ", "a", 2));
    }
}
