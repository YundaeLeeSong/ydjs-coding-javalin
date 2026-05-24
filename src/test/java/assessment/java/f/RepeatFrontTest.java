package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class RepeatFrontTest {
    /**
     * < Q6 >
     * Tests the repeatFront method.
     */
    @Test
    public void testRepeatFront() {
        assertEquals("ChocChoChC", RepeatFront.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", RepeatFront.repeatFront("Chocolate", 3));
        assertEquals("IcI", RepeatFront.repeatFront("Ice Cream", 2));
        assertEquals("I", RepeatFront.repeatFront("Ice Cream", 1));
        assertEquals("", RepeatFront.repeatFront("Ice Cream", 0));
        assertEquals("xyzxyx", RepeatFront.repeatFront("xyz", 3));
        assertEquals("", RepeatFront.repeatFront("", 0));
        assertEquals("JavaJavJaJ", RepeatFront.repeatFront("Java", 4));
        assertEquals("J", RepeatFront.repeatFront("Java", 1));
    }
}
