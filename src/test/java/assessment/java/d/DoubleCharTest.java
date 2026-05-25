package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class DoubleCharTest {
    /**
     * < Q2 >
     * Tests the doubleChar method.
     */
    @Test
    public void testDoubleChar() {
        assertEquals("TThhee", DoubleChar.doubleChar("The"));
        assertEquals("AAAAbbbb", DoubleChar.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", DoubleChar.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", DoubleChar.doubleChar("Word!"));
        assertEquals("!!!!", DoubleChar.doubleChar("!!"));
        assertEquals("))", DoubleChar.doubleChar(")"));
        assertEquals("aa", DoubleChar.doubleChar("a"));
        assertEquals("..", DoubleChar.doubleChar("."));
        assertEquals("aaaa", DoubleChar.doubleChar("aa"));
    }
}


