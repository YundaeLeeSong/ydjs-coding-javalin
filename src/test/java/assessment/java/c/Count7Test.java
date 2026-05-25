package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Count7Test {
    /**
     * < Q13 >
     * Tests the count7 method.
     */
    @Test
    public void testCount7() {
        assertEquals(2, Count7.count7(717));
        assertEquals(1, Count7.count7(7));
        assertEquals(0, Count7.count7(123));
        assertEquals(2, Count7.count7(77));
        assertEquals(1, Count7.count7(7123));
        assertEquals(3, Count7.count7(771237));
        assertEquals(4, Count7.count7(771737));
        assertEquals(2, Count7.count7(47571));
        assertEquals(6, Count7.count7(777777));
        assertEquals(4, Count7.count7(70701277));
        assertEquals(5, Count7.count7(777576197));
        assertEquals(0, Count7.count7(99999));
        assertEquals(1, Count7.count7(99799));
    }
}


