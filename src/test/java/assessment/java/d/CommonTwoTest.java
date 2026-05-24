package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CommonTwoTest {
    /**
     * < Q1 >
     * Tests the commonTwo method.
     */
    @Test
    public void testCommonTwo() {
        assertEquals(2, CommonTwo.commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
        assertEquals(3, CommonTwo.commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
        assertEquals(3, CommonTwo.commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
        assertEquals(3, CommonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "c"}));
        assertEquals(3, CommonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
        assertEquals(3, CommonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "c", "c"}));
        assertEquals(2, CommonTwo.commonTwo(new String[]{"b", "b", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
        assertEquals(4, CommonTwo.commonTwo(new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"}));
        assertEquals(1, CommonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b"}));
        assertEquals(1, CommonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"c", "c"}));
        assertEquals(1, CommonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b", "x"}));
        assertEquals(1, CommonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b"}));
        assertEquals(1, CommonTwo.commonTwo(new String[]{"a"}, new String[]{"a", "b"}));
        assertEquals(0, CommonTwo.commonTwo(new String[]{"a"}, new String[]{"b"}));
        assertEquals(0, CommonTwo.commonTwo(new String[]{"a", "a"}, new String[]{"b", "b"}));
        assertEquals(2, CommonTwo.commonTwo(new String[]{"a", "b"}, new String[]{"a", "b"}));
    }
}
