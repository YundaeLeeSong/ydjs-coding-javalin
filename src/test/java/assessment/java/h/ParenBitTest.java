package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ParenBitTest {
    /**
     * < Q12 >
     * Tests the parenBit method.
     */
    @Test
    public void testParenBit() {
        assertEquals("(abc)", ParenBit.parenBit("xyz(abc)123"));
        assertEquals("(hello)", ParenBit.parenBit("x(hello)"));
        assertEquals("(xy)", ParenBit.parenBit("(xy)1"));
        assertEquals("(possible)", ParenBit.parenBit("not really (possible)"));
        assertEquals("(abc)", ParenBit.parenBit("(abc)"));
        assertEquals("(abc)", ParenBit.parenBit("(abc)xyz"));
        assertEquals("(abc)", ParenBit.parenBit("(abc)x"));
        assertEquals("(x)", ParenBit.parenBit("(x)"));
        assertEquals("()", ParenBit.parenBit("()"));
        assertEquals("(ipsa)", ParenBit.parenBit("res (ipsa) loquitor"));
        assertEquals("(not really)", 
            ParenBit.parenBit("hello(not really)there"));
        assertEquals("(ab)", ParenBit.parenBit("ab(ab)ab"));
    }
}


