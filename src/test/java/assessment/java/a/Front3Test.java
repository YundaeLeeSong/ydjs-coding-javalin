package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Front3Test {
    @Test
    public void testFront3() {
        assertEquals("JavJavJav", Front3.front3("Java"));
        assertEquals("ChoChoCho", Front3.front3("Chocolate"));
        assertEquals("abcabcabc", Front3.front3("abc"));
        assertEquals("abcabcabc", Front3.front3("abcXYZ"));
        assertEquals("ababab", Front3.front3("ab"));
        assertEquals("aaa", Front3.front3("a"));
        assertEquals("", Front3.front3(""));
    }
}


