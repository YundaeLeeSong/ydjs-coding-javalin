package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class OneTwoTest {
    /**
     * < Q7 >
     * Tests the oneTwo method.
     */
    @Test
    public void testOneTwo() {
        assertEquals("bca", OneTwo.oneTwo("abc"));
        assertEquals("cat", OneTwo.oneTwo("tca"));
        assertEquals("catdog", OneTwo.oneTwo("tcagdo"));
        assertEquals("hocolctea", OneTwo.oneTwo("chocolate"));
        assertEquals("231564897", OneTwo.oneTwo("1234567890"));
        assertEquals("abxabxabxabxabxabxabx", 
            OneTwo.oneTwo("xabxabxabxabxabxabxab"));
        assertEquals("bcaefd", OneTwo.oneTwo("abcdefx"));
        assertEquals("bcaefd", OneTwo.oneTwo("abcdefxy"));
        assertEquals("bcaefdyzx", OneTwo.oneTwo("abcdefxyz"));
        assertEquals("", OneTwo.oneTwo(""));
        assertEquals("", OneTwo.oneTwo("x"));
        assertEquals("", OneTwo.oneTwo("xy"));
        assertEquals("yzx", OneTwo.oneTwo("xyz"));
        String longInput = "abcdefghijklkmnopqrstuvwxyz1234567890";
        String longExpected = "bcaefdhigkljmnkpqostrvwuyzx231564897";
        assertEquals(longExpected, OneTwo.oneTwo(longInput));
        assertEquals(longExpected, OneTwo.oneTwo(
            longInput.substring(0, longInput.length() - 1)));
        assertEquals(longExpected.substring(0, longExpected.length() - 3), 
            OneTwo.oneTwo(longInput.substring(0, longInput.length() - 2)));
    }
}
